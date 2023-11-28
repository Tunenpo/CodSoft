package Task_3;

public class AtmMachine implements IAtmMachine {

    IBankAccount bankAccount = new BankAccount();
    public void withdraw(double amount) {
        boolean isWithdrew = bankAccount.withdrawMoney(amount);
        if (!isWithdrew) {
            var balance = bankAccount.getAccountBalance();
            System.out.println("Opps!. Insufficient balance your balance is " + balance);
        }
        else {
            System.out.println("You've successfully withdraw " + amount);
        }
    }
    public void deposit(double amount) {
        bankAccount.depositMoney(amount);
        System.out.println("You've Successfully deposited " + amount);
    }
    public void checkBalance() {
        var amount = bankAccount.getAccountBalance();
        System.out.println("Your Account balance is " + amount);
    }

}
