package com.shanksit.fitloft.repository;

import com.shanksit.fitloft.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by leiyuch on 15/12/1.
 * 在我陨落的地方 天空闪耀着光芒
 */

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query("select u from User u where u.user_name = ?1 and u.user_pwd = ?2")
    public List auth(String user_name, String user_pwd);

    @Query("select u from User u where u.user_name = ?1")
    public User getUserByUserName(String user_name);

    @Query("select u from User u where u.professional_ratings = ?1 and u.user_type = ?2")
    public List findUserByLevelAndUserType(String professional_ratings, String user_type);
    @Query("select u from User u where u.recommend = 1")
    public  List<User> getUersByrecommend();
}
