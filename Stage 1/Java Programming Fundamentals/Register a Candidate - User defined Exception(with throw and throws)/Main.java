import java.util.*;

public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException {
        Candidate cd = new Candidate();
        System.out.println("Enter the candidate Details");
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.next();
        System.out.println("Gender");
        String gender = sc.next();
        System.out.println("Expected Salary");
        double salary = sc.nextDouble();
        if(salary<10000){
            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        else{
            cd.setName(name);
            cd.setGender(gender);
            cd.setExpectedSalary(salary);
            return cd;
        }
    }
    
    public static void main (String[] args) {
        /* code */
        try{
            Candidate cd = getCandidateDetails();
            System.out.println("Registration Successful");
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}