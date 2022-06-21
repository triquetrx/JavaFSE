package Handson.Hands_on_2.Singleton;

public class Main {
    public static void main(String[] args) {
        DBConn dbConn = DBConn.getInstance();
        dbConn.display();
    }
}
