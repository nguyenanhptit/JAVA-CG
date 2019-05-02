package com.jdbc.repository;

import com.jdbc.model.Customer;
import com.jdbc.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
Iterable<Customer> findAllByProvince (Province province); // return customer list of province

Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
