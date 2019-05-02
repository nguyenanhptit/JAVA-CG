package com.jdbc.service;

import com.jdbc.model.Customer;
import com.jdbc.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstName(String firstname, Pageable pageable);
}
