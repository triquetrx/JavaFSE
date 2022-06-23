import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee emp = new PermanentEmployee(121,"Zaid Khan",30000);
        Loan ln = new Loan();
        System.out.println(ln.calculateLoanAmount(emp));
    }
    
}