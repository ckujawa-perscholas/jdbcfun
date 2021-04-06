package com.perscholas.daoexample.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbstractDAO {

	private final String url = "jdbc:mariadb//localhost/classicmodels";
	private final String user = "user";
	private final String pass = "pass";
	
	protected Connection conn = null;
	
	public AbstractDAO() {
		
		try {
			connect();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void connect() throws SQLException {
		conn = DriverManager.getConnection(url);
	}

	public Connection getConn() {
		return conn;
	}

	public void dispose() throws SQLException {
		if (conn != null) {
			conn.close();
		}
	}
	
}
