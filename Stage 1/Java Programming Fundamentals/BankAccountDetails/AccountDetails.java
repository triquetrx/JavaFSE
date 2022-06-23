
import java.util.Scanner;

public class AccountDetails {

    public Account getAccountDetails(){
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account id:");
        int account = sc.nextInt();
        acc.setAccountId(account);
        System.out.println("Enter account type:");
        String accType = sc.next();
        acc.setAccountType(accType);
        System.out.println("Enter balance:");
        int balance = sc.nextInt();
        while(balance<=0){
            System.out.println("Balance should be positive");
            System.out.println("Enter balance");
            balance = sc.nextInt();
        }
        acc.setBalance(balance);
        return acc;
    }

    public int getWithdrawAmount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn:");
        int amount = sc.nextInt();
        while(amount<=0){
            System.out.println("Amount should be positive");
            System.out.println("Enter amount to be withdrawn:");
            amount = sc.nextInt();
        }
        return amount;
    }

    public static void main(String[] args) {
        AccountDetails acd = new AccountDetails();
        Account acc = acd.getAccountDetails();
        if(acc.withdraw(acd.getWithdrawAmount())){
            System.out.println("Balance amount after withdraw: "+acc.getBalance());
        }
        else{
            System.out.println("Sorry!!! No enough balance");
        }
    }
}
