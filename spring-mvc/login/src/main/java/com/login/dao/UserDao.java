package com.login.dao;

import com.login.model.Login;
import com.login.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
    private static List<User> users;
    static {
        users = new ArrayList<>();
        User u1 = new User("john","123456","john","john@codegym.vn",10);
        users.add(u1);
        User u2 = new User("bin","123456","bin","bin@gymcode.vn",20);
        users.add(u2);
        User u3 = new User("ronaldo","123456","ronaldo","ronaldo@juv.vn",30);
        users.add(u3);
        User u4 = new User("mark","123456","mark","mark@fb.vn",35);
        users.add(u4);
        User u5 = new User("nguyen","123456","nguyen","nguyen@de.vn",22);
        users.add(u5);
    }
    public static User checkLogin(Login login){
        for (User u:users){
            if(u.getAccount().equals(login.getAccount())&& u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
