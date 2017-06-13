package com.example.dao;

import com.example.pojo.User;
import com.example.pojo.UserTake;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by maozz11347 on 2017/6/12.
 */
public interface UserTakeRepository extends JpaRepository<User,Long> {


    //Page<UserTake> findByUser(User user, Pageable pagusereable);



/*    @Query("select h.name as name, avg(r.rating) as averageRating  from Hotel h left outer join h.reviews r  group by h")
//   @Query("select u from User u where u.emailAddress = ?1")
    Page<UserTake> findByUser(Pageable pageable);


    @Modifying
    @Query("update User u set u.userName = ?1 where c.id = ?2")
    int modifyByIdAndUserId(String  userName, Long id);*/

}
