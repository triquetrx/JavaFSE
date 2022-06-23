
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	    if(employeeObj instanceof PermanentEmployee){
            return 0.15*employeeObj.getSalary();
        }
        return 0.1*employeeObj.getSalary();	
	}

}
