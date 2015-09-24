/**
 * Created by koshin on 9/23/15.
 */
public class Account {
    private int balance = 0;
    public Account(int initialDeposit) {
        if (initialDeposit >= 0) {
            balance = initialDeposit;
        }
    }

    public int getBalance(){
        return balance;
    }

    public void withdrawFunds(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }
    }

    public void depositFunds(int amount){
        if(amount > 0){
            balance = balance + amount;
        }
    }
}
