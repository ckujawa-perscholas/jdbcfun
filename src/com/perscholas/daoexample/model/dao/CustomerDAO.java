package com.perscholas.daoexample.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.perscholas.daoexample.model.Customer;

public class CustomerDAO extends AbstractDAO implements ICustomerDAO {

	public CustomerDAO() {
		super();
	}
	
	@Override
	public Customer getCustomerById(int id) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer customer = new Customer();
		
		try {
			ps = conn.prepareStatement(GET_CUST_BY_ID);
			rs = ps.executeQuery();

			while (rs.next()) {
				customer.setId(rs.getInt("id"));
				customer.setEmail(rs.getString("email"));
				customer.setFname(rs.getString("fname"));
				customer.setLname(rs.getString("lname"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
					if (ps != null) {
						ps.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		return customer;
	}

	@Override
	public void addCustomer(Customer c) {
		
	}

	@Override
	public void removeCustomerById(int id) {
		// TODO Auto-generated method stub

	}

}
