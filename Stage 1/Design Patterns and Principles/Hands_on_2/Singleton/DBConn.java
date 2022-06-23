package Handson.Hands_on_2.Singleton;

public class DBConn {
    private static DBConn instance = new DBConn();

    private DBConn() {

    }

    public static DBConn getInstance() {
        return instance;
    }

    public void display(){
        System.out.println("This is an object of DBConn class");
    }

}
