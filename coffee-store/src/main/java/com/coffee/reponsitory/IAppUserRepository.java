package com.coffee.reponsitory;

import com.coffee.model.account.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface IAppUserRepository extends JpaRepository<AppUser, Integer> {
    /**
     * @creator TaiLV
     * Date 09/08/2022
     * @param
     * @return  AppUser list
     */
    @Query(value = " select app_user.id, app_user.name, app_user.password from app_user where is_deleted = 0 ", nativeQuery = true)
    List<AppUser> findAllUser();
}
