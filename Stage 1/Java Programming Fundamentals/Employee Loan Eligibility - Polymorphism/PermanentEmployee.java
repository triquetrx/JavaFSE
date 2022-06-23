public class PermanentEmployee extends Employee {
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }

    // Getters and Setters

    public double getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    @Override
    public void calculateSalary() {
        double pfAmount = 0.12*basicPay;
        salary = basicPay - pfAmount;
    }
}
