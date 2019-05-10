package com.security.demospringsecurity.service.impl;

import com.security.demospringsecurity.model.Role;
import com.security.demospringsecurity.model.User;
import com.security.demospringsecurity.repository.RoleRepository;
import com.security.demospringsecurity.repository.UserRepository;
import com.security.demospringsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Qualifier("userRepository")
    @Autowired
    private UserRepository userRepository;

    @Qualifier("roleRepository")
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
       // user.setPassword(user.getPassword());
        user.setActive(1);
        Role adminRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(adminRole)));

//        Role userRole = roleRepository.findByRole("USER");
//        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));

        userRepository.save(user);
    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByEmail(username);
//        if(user == null){
//
//            throw new UsernameNotFoundException("User "+ username + "was not found in the database");
//        }
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//
//            for (Role role:user.getRoles()){
//                grantedAuthorities.add(new SimpleGrantedAuthority(role.getRole()));
//            }
//
//    return  new org.springframework.security.core.userdetails.User(user.getEmail(),user.getPassword(),grantedAuthorities);
//    }
//

}
