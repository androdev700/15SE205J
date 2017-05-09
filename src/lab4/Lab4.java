package lab4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author andro
 */
public class Lab4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BankAccount account = new BankAccount();
        DecimalFormat format = new DecimalFormat(".##");

        System.out.print("Welcome to the Bank.\nEnter Your Name\n");
        String name = s.next();
        System.out.print("Hi " + name + "! How are you doing today?\n");

        System.out.print("What's your balance amount?\n");
        account.setBalance(s.nextDouble());

        System.out.print("What's your annual interest rate?\n");
        account.setAnnualInterestRate(s.nextDouble());

        System.out.print("1. To calculate debt for \'n\' months \n");
        System.out.print("2. To calculate lowest monthly payment that will pay off all debt in under 1 year \n");

        int choice = s.nextInt();
        switch (choice) {
            case 1:
                System.out.print("What's your monthly payment rate?\n");
                account.setMonthlyPaymentInterest(s.nextDouble());
                System.out.print("What's your due time in months?\n");
                account.setTime(s.nextDouble());
                int counter = 0;
                while (account.getTime() != 0) {
                    counter++;
                    account.calculateMonthly();
                    System.out.print("Month: " + counter + "\n"
                            + "Minimum monthly payment: " + format.format(account.getMonthlyPayment()) + "\n"
                            + "Remaining balance: " + format.format(account.getBalance()) + "\n");
                    if (counter % 12 == 0) {
                        System.out.print("Total paid: " + format.format(account.getTotalPaid()) + "\n"
                                + "Remaining balance: " + format.format(account.getBalance()) + "\n");
                    }
                    account.setTime(account.getTime() - 1);
                }
                break;
            case 2:
                double minimumMonthlyPay = 10.0;
                double copyData = account.getBalance();
                while (account.calculateMinimumMonthlyPayment(minimumMonthlyPay)) {
                    minimumMonthlyPay += 10;
                    account.setBalance(copyData);
                }
                System.out.println("Lowest Payment: " + minimumMonthlyPay);
                break;
            default:
                System.out.println("Wrong Choice!");
                break;
        }
    }
}
