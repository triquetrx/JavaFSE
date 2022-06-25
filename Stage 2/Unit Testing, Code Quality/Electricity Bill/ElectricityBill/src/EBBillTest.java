import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;


public class EBBillTest
{
    private EBBill ebBill;
    //Write JUNIT Test Code
    @Test
    public void Test0(){
        ebBill = new EBBill(0);
        assertTrue(0==ebBill.calculateBillAmount());
    }
    @Test
    public void Test50(){
        ebBill = new EBBill(50);
        assertTrue(130==ebBill.calculateBillAmount());
    }
    @Test
    public void Test100(){
        ebBill = new EBBill(100);
        assertTrue(292.5 == ebBill.calculateBillAmount());
    }
    @Test
    public void Test200(){
        ebBill = new EBBill(200);
        assertTrue(818.5 == ebBill.calculateBillAmount());
    }
    @Test
    public void Test1000(){
        ebBill = new EBBill(1000);
        assertTrue(7018.5 == ebBill.calculateBillAmount());
    }
    @Test
    public void Test5000(){
        ebBill = new EBBill(5000);
        assertTrue((5000*7.75) == ebBill.calculateBillAmount());
    }
    
}