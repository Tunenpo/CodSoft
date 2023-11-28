package Task_3;

public interface IBankAccount {
    void depositMoney(double amount);

    double getAccountBalance();

    boolean withdrawMoney(double amount);
}
