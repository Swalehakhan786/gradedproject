package com.greatlearning.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.greatlearning.springboot.model.Customer;

public interface CustomerService {
	List<Customer> getAllCustomers();
	void saveCustomer(Customer customer);
	Customer getCustomerById1(long id);
	void deleteCustomerById(long id);
	Page<Customer> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	Customer getCustomerById(long id);
}
