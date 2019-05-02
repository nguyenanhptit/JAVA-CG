package com.valid.login.service.impl;

import com.valid.login.model.User;
import com.valid.login.service.UserService;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class UserServiceImpl implements UserService  {


    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String email = user.getEmail();
        ValidationUtils.rejectIfEmpty(errors, "email","email.empty");
        if(!email.matches("^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")){
            errors.rejectValue("email","email.regex");
        }
    }
    }

