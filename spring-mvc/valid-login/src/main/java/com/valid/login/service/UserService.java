package com.valid.login.service;

import org.springframework.data.domain.Page;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public interface UserService extends Validator {
    public void validate(Object target, Errors errors) ;

}
