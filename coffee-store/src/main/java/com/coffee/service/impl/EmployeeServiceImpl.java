package com.coffee.service.impl;



import com.coffee.dto.employe.IEmployeeDTO;

import com.coffee.model.account.AppRole;
import com.coffee.model.account.AppUser;
import com.coffee.model.account.UserRole;
import com.coffee.model.employee.Employee;
import com.coffee.repository.IEmployeeRepository;
import com.coffee.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeRepository iEmployeeRepository;

    /**
     * Create by TuyenTN
     * Date: 9-8-2022 16:37
     * @param pageable
     * @param searchByName
     * @param searchByPhone
     * @param searchByAccount
     * @return
     */
    @Override
    public Page<IEmployeeDTO> getAllEmployee(Pageable pageable, String searchByName, String searchByPhone, String searchByAccount) {
        return iEmployeeRepository.getAllEmployee(pageable,"%"+searchByName+"%","%"+searchByPhone+"%",
                "%"+searchByAccount+"%");
    }

    /**
     * Create by TuyenTN
     * Date: 9-8-2022
     * findEmployeeById(id)
     * @param id
     * @return
     */
    @Override
    public IEmployeeDTO findEmployeeById(Integer id) {
        return this.iEmployeeRepository.findEmployeeById(id);
    }

    /**
     * Create by TuyenTN
     * Date: 9-8-2022
     * deleteEmployeeById()
     * @param id
     */
    @Override
    public void deleteEmployeeById(Integer id) {
        this.iEmployeeRepository.deleteEmployeeById(id);
    }

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param employee
     * if employee null : Create new employee
     * @return  true: create employee success, status 200 / false: status 404
     * @return  create Employee success
     */
    @Override
    public Employee saveEmployee(Employee employee) {

        AppUser appUser = new AppUser();
        appUser.setCreationDate(Date.valueOf(LocalDate.now()));
        appUser.setPassword("123456");
//        appUser.setUserName(employee.getAppUser().getUserName());

//        AppUser appUser1 = this.findAppUserByUserName(appUser.getUserName());
        AppRole appRole = new AppRole();
        appRole.setId(2);
//
        UserRole userRole = new UserRole();
        userRole.setAppUser(appUser);
        userRole.setAppRole(appRole);


        return iEmployeeRepository.saveEmployee(employee);
    }

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param id
     * if id null : Bad request
     * @return  object Employee
     */
    @Override
    public Employee findById(Integer id) {
        return iEmployeeRepository.findByIdEmployee(id);
    }

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param employee
     * if employee null : Create new employee
     * @return  true: edit employee success, status 200 / false: status 404
     */

    @Override
    public Employee editEmployee(Employee employee) {
        return iEmployeeRepository.editEmployee(employee);
    }

    @Override
    public AppUser findAppUserByUserName(String username) {
        return this.iEmployeeRepository.getAppUserByUsername(username);
    }


}