package Task_3;

import java.util.Scanner;

public class MainMenu{
    IAtmMachine atmMachine = new AtmMachine();
    Scanner scanner = new Scanner(System.in);
    public void Main(){

        WelcomeLogo.pirntLogo();
        userMenu();
    }
    public void userMenu(){
        System.out.println("Enter 1 to withdraw");
        System.out.println("Enter 2 to deposit");
        System.out.println("Enter 3 to check balance");

        try {
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    withdrawMenu();
                    break;
                case  2:
                    depositMenu();
                    break;
                case 3:
                    atmMachine.checkBalance();
                    break;
                default:
                    break;
            }
            userMenu();

        } catch (Exception e) {
            System.out.println("Invalid Option");
        }
    }
    public void withdrawMenu(){
        System.out.println("Enter amount ");
        try {
            double amount = scanner.nextDouble();
            atmMachine.withdraw(amount);
        } catch (Exception e) {
            System.out.println("Invalid Input ");
        }
    }
    public  void depositMenu(){
        System.out.println("Enter amount ");
        try {
            double amount = scanner.nextDouble();
            atmMachine.deposit(amount);
        } catch (Exception e) {
            System.out.println("Invalid Input ");
        }
    }
}
