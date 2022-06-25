import org.junit.Test;
import static org.junit.Assert.fail;
import static org.junit.Assert.*;

public class ProductTest {

 //Write the code for test methods
 @Test
 public void deleteproduct(){
    ProductDAO pda = new ProductDAO();
    Product pd1 = new Product();
    Product pd2 = new Product("p12","productName",200.00);
    Product pd3 = new Product("p123","productName2",2001.00);
    
    assertTrue(pda.addProduct(pd1));
    assertTrue(pda.addProduct(pd2));
    assertTrue(pda.addProduct(pd3));
    assertFalse(pda.addProduct(null));
    
    pd1.setPrice(13000);
    
    assertTrue(pda.deleteProduct(pd1));
    assertTrue(pda.deleteProduct(pd2));
    assertTrue(pda.deleteProduct(pd3));
    assertFalse(pda.deleteProduct(pd1));
    assertFalse(pda.deleteProduct(null));
 }
}
