package com.sun.dao;

import com.sun.model.User;
import org.springframework.stereotype.Repository;

/**
 * Created by sunpeng on 2017/4/3.
 */

@Repository
public class UserDao {
    public User getUserById(Integer id) {
        User user=new User.Builder(id).setName("sunpeng").setAge(18).build();
        return user;
    }
}
