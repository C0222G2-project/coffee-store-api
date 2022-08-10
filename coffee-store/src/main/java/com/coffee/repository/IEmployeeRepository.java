package com.coffee.repository;


import com.coffee.model.employee.Employee;
import com.coffee.model.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param employee
     * @return  true: employee, create employee success, status 200 / false: status 404
     */
    @Modifying
    @Transactional
    @Query(value = " INSERT INTO employee (user_id, name, image, phone_number, address, email, gender, birthday, salary, position_id) " +
            " VALUES (:#{#employee.user.username}, :#{#employee.name}, :#{#employee.image}, :#{#employee.phoneNumber}, " +
            " :#{#employee.address}, :#{#employee.name}, :#{#employee.gender}, :#{#employee.birthday}, :#{#employee.salary}, " +
            " :#{#employee.position.id}); ", nativeQuery = true)
    Employee saveEmployee(@Param("employee") Employee employee);

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param name
     * @param image
     * @param birthday
     * @param email
     * @param gender
     * @param phoneNumber
     * @param address
     * @param salary
     * @param position
     * @return  true: employee ,edit employee success, status 200 / false: status 404
     */
    @Transactional
    @Modifying
    @Query(value = " update employee set name= ?, image = ?, birthday = ?, email = ? , gender = ?, phone_number = ?,address = ?, " +
            " salary = ?, position_id = ? " , nativeQuery = true)
    Employee editEmployee(String name, String image, Date birthday , String email, int gender, String phoneNumber, String address, Double salary, Position position);

    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param id
     * if id null : Bad request
     * @return  object Employee
     */
    @Query(value = " select employee.id, employee.name, employee.image,employee.phone_number , employee.address , employee.email, employee.gender, " +
            " employee.birthday, employee.salary, employee.position_id , employee.user_id, employee.is_deleted from employee " +
            " join app_user on employee.user_id = app_user.id " +
            " join `position` on employee.position_id = `position`.id " +
            " where employee.id = 1 and employee.is_deleted = 0", nativeQuery = true)
    Employee findByIdEmployee(Integer id);


}
