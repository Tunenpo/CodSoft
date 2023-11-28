package Task_3;


import java.util.Dictionary;

public class BankAccount implements IBankAccount {
    double accountBalance = 0;
    @Override
    public void depositMoney(double amount){

        accountBalance += amount;
    }
    @Override
    public double getAccountBalance(){

        return accountBalance;
    }
    @Override
    public boolean withdrawMoney(double amount){
        if (amount > accountBalance) {
            return false;
        }
        else {
            accountBalance -= amount;
            return true;
        }

    }
}
