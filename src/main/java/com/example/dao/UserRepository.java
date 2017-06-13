package com.example.dao;

import com.example.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by maozz11347 on 2017/6/5.
 */
public interface UserRepository  extends JpaRepository<User,Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
//    @Modifying
//    @Query("update User u set u.userName = ?1 where u.id = ?2")
//    int modifyByIdAndUserId(String  userName, Long id);
}
