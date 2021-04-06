package com.perscholas.daoexample.model.dao;

import com.perscholas.daoexample.model.Customer;

public interface ICustomerDAO {
	
	public static final String GET_CUST_BY_ID = "select * from customer where id = ?";
	public static final String ADD_CUSTOMER = "insert into customer values (?,?,?,?)";
	public static final String REMOVE_CUST_BY_ID = "delete from customer where id=?";
	
	public Customer getCustomerById(int id);
	public void addCustomer(Customer c);
	public void removeCustomerById(int id);
}
