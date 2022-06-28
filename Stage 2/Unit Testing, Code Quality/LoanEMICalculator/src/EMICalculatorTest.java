import static org.junit.Assert.assertEquals;
import java.util.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class EMICalculatorTest {
    
    private double principal;
    private String loanType;
    private double durationInYears;
    private double expectedOutput;
    private EMICalculator emi ;
    
    @Before
    public void initialize(){   
    	 emi = new EMICalculator();
    }
    
    
    public EMICalculatorTest(double principal,String loanType,double durationInYears, double expectedOutput){
        this.principal=principal;
        this.loanType=loanType;
        this.durationInYears=durationInYears;
        this.expectedOutput=expectedOutput;
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> values(){
        return Arrays.asList(new Object[][]{
            {10000,"Housing Loan",10,83.838},
            {10000,"Vehicle Loan",10,83.796},
            {10000,"Personal Loan",10,83.754},
            {5000,"Personal Loan",10,0},
            {50000,"Personal Loan",0,0},
            {50000,"Personal Loan",30,0},
            {50000,"Personal",30,0}
        });
    }

    @Test
    public void testCalculateEMI(){
    	double value  = emi.calculateEMI(principal, loanType, durationInYears);
    	assertEquals(expectedOutput, value,0.001);
    }
    
}
