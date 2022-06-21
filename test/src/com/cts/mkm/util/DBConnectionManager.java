package com.cts.mkm.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import com.cts.mkm.exception.MkmOrderException;
public class DBConnectionManager {
    private static DBConnectionManager instance;
    public static final String PROPERTY_FILE = "database.properties";
    public static final String DRIVER = "drivername";
    public static final String URL = "url";
    public static final String USER_NAME = "username";
    public static final String PASSWORD = "password";
    private static Connection con = null;
    private static Properties props = null;
    /**
     * @throws MkmOrderException
     */
    private DBConnectionManager() throws MkmOrderException {
        loadProperties();
        try {
            Class.forName(props.getProperty(DRIVER));
            this.con = DriverManager.getConnection(props.getProperty(URL), props.getProperty(USER_NAME),
                            props.getProperty(PASSWORD));
        } catch (ClassNotFoundException ex) {
            throw new MkmOrderException("Could not find Driver class ",
                    ex.getCause());
        } catch (SQLException e) {
            throw new MkmOrderException("Database Connection Creation Failed", e.getCause());
        }
    }
    /**
     * @return Connection
     */
    public Connection getConnection() {
        return con;
    }
    public static DBConnectionManager getInstance() throws MkmOrderException {
//Fill the code
        return new DBConnectionManager();
    }
    private void loadProperties() throws MkmOrderException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(PROPERTY_FILE);
            props = new Properties();
            props.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new MkmOrderException("Database Property File Not Found",
                    e.getCause());
        } catch (IOException e) {
            throw new MkmOrderException("Exception during property file I/O",
                    e.getCause());
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new MkmOrderException("Exception during property file I/O", e.getCause());
                }
            }
        }
    }
    public static void main(String[] args)
    {
        try {
            getInstance();
        } catch (MkmOrderException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}