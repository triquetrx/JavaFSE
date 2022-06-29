package com.cts.forex.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.forex.exception.ForexCardPaymentException;

public class DBConnectionManager {

	private static Connection con = null;
	private static DBConnectionManager instance;
	public  DBConnectionManager()  throws ForexCardPaymentException
	{
		InputStream fis=null;

		// TYPE YOUR CODE HERE
		try {

			Properties prop = new Properties();
			fis = new FileInputStream("database.properties");
			prop.load(fis);
			Class.forName(prop.getProperty("drivername"));
			con = DriverManager.getConnection(prop.getProperty("url"),
			prop.getProperty("username"),
			prop.getProperty("password"));

		} catch (IOException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			
		}

	}
	public static DBConnectionManager getInstance() throws ForexCardPaymentException {


		// TYPE YOUR CODE HERE
		instance= new DBConnectionManager();
		return instance;
	}
	public Connection getConnection() {

		// TYPE YOUR CODE HERE
		
		return con;
	}
}
