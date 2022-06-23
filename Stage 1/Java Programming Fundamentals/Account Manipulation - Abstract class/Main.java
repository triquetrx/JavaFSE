public class Main {
    public static void main(String[] args) {
        Customer cust = new Customer(101,"Zaid","zaid@email.com");
        SavingsAccount sacc = new SavingsAccount(1001,cust,20000,400);

        if (sacc.withdraw(10000)){
            System.out.println(sacc.getBalance());
        }
    }
}
