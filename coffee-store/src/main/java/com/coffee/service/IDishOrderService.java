package com.coffee.service;

import com.coffee.model.dish_order.DishOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IDishOrderService {

     /**
     *   Author: BinhPX
     *   Date created: 09/08/2022
     *   This function will return all data can get, @param pageable, @return
     **/
    Page<DishOrder> getAllOrder(Pageable pageable);


    /**
     *   Author: BinhPX
     *   Date created: 09/08/2022
     *   This function create new order menu, @param orderDish, @return
     **/
    void createOrder(DishOrder orderDish);

    /**
     *   Author: BinhPX
     *   Date created: 09/08/2022
     *   This function return order menu could find, @param tableId, @return list DishOrder
     **/

    List<DishOrder> getOrderHaveCode(String param);

    void deleteDishOrder(String param);
}
