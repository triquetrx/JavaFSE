import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class LoginTest {

      
    	    	 
      //Write the code for adding and deleting Login data
    @Test
    public void methoddeleteLogin(){
        Login login1 = new Login("zaid","zaid");
        Login login2 = new Login("khan","khan");
        
        LoginDAO login = new LoginDAO();
        
        assertTrue(login.addLogin(login1));
        assertFalse(login.addLogin(null));
        
        login2.setUserName("triquetrx");
        login2.setPassword("zaid");
        
        assertTrue(login.deleteLogin(login1));
        assertFalse(login.deleteLogin(login2));
        assertFalse(login.deleteLogin(null));
    }
    

}

