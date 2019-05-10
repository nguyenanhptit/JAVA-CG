package com.security.demospringsecurity.service;

import com.security.demospringsecurity.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService  {
    public User findUserByEmail(String email);

    public void saveUser(User user);
}
