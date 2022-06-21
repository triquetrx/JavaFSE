package com.cts.tws.dao;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.cts.tws.exception.VehicleCostEstimationException;
public class DBConnectionManager {

    private static Connection con = null;
    private static DBConnectionManager instance;
    public static final String PROPERTY_FILE = "database.properties";
    public static final String DRIVER = "drivername";
    public static final String URL = "url";
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";

    public DBConnectionManager() throws VehicleCostEstimationException
    {
//WRITE YOUR CODE HERE
        try{
            Properties props = new Properties();
            InputStream fis = new FileInputStream(PROPERTY_FILE);
            props.load(fis);
            Class.forName(props.getProperty(DRIVER));
            con = DriverManager.getConnection(props.getProperty(URL), props.getProperty(USER_NAME), props.getProperty(PASSWORD));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static DBConnectionManager getInstance() throws VehicleCostEstimationException
    {
//WRITE YOUR CODE HERE
        return new DBConnectionManager();
    }
    public Connection getConnection()
    {
//WRITE YOUR CODE HERE
        return con;
    }
}