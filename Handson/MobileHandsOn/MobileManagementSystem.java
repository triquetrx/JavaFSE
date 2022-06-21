package Handson.MobileHandsOn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class MobileManagementSystem {
    Map<Integer,Integer> result = new HashMap<>();
    public Map<Integer, Integer> viewMobileWithInTheRange(int minRange,int maxRange){
        // Fill your code here
        try {
            String sql = "Select * from mobile where price between "+minRange +" and "+maxRange;
            Statement statement = DB.getConnection().createStatement();

            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                result.put(resultSet.getInt("productId"),resultSet.getInt("price"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;

    }
}
