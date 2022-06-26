import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	
	private Customer cust = new Customer("987654321234","Zaid","Khan","Mumbai",1234567890,"abc@xyz.com");
    @Test
    public void testIsValidAadharNo(){
        String name="987654321234";
        String name1 = "123456789";
        String name2 = "098765432123";
        assertTrue(Customer.isValidAadharNo(name));
        assertFalse(Customer.isValidAadharNo(name1));
        assertFalse(Customer.isValidAadharNo(name2));
    }
    
    @Test
    public void testFirstNameLastName(){
        assertNotEquals(cust.getFirstName(),cust.getLastName());
    }
    @Test
    public void testEmailNotNull(){
        assertNotNull(cust.getEmailId());
    }
}
