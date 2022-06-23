public class Account {
    private int accountId,balance;
    private String accountType;

    public int getAccountId(){
        return accountId;
    }
    public int getBalance(){
        return balance;
    }
     public String getAccountType() {
        return accountType;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount){
        if(balance < amount){
            return false;
        }
        balance-=amount;
        return true;
    }
}
