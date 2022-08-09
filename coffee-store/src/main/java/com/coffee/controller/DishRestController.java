package com.coffee.controller;

import com.coffee.model.dish.Dish;
import com.coffee.service.IDishService;
import com.coffee.service.IDishTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/dish")
public class DishRestController {
    @Autowired
    private IDishService iDishService;
    @Autowired
    private IDishTypeService iDishTypeService;

    @GetMapping("")
    public ResponseEntity<Page<Dish>> getAllDish(@PageableDefault(10)Pageable pageable) {
        Page<Dish> dishPage = this.iDishService.findAll(pageable);
        if (dishPage.isEmpty()) {
            return new ResponseEntity<>(dishPage, HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(dishPage, HttpStatus.OK);
        }
    }

    @GetMapping("/findById{id}")
    public ResponseEntity<Dish> findById(@PathVariable Integer id) {
        Dish dish = this.iDishService.findById(id);
        return new ResponseEntity<>(dish, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Integer id) {
        this.iDishService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
