package lab4;

/**
 *
 * @author andro
 */
public class BankAccount {

    private double time;
    private double balance;
    private double unpaidBalance;
    private double annualInterest;
    private double monthlyPaymentInterest;
    private double monthlyPayment;
    private double interestMade;
    private double totalPaid;

    void setTime(double time) {
        this.time = time;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }

    void setUnpaidBalance(double unpaidBalance) {
        this.unpaidBalance = unpaidBalance;
    }

    void setAnnualInterestRate(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    void setMonthlyPaymentInterest(double monthlyPaymentInterest) {
        this.monthlyPaymentInterest = monthlyPaymentInterest;
    }

    void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    void setInterestMade(double interestMade) {
        this.interestMade = interestMade;
    }

    void setTotalPaid(double totalPaid) {
        this.totalPaid = totalPaid;
    }

    double getTime() {
        return time;
    }

    double getBalance() {
        return balance;
    }

    double getUnpaidBalance() {
        return unpaidBalance;
    }

    double getAnnualInterest() {
        return annualInterest;
    }

    double getMontlyPaymentInterest() {
        return monthlyPaymentInterest;
    }

    double getMonthlyPayment() {
        return monthlyPayment;
    }

    double getInterestMade() {
        return interestMade;
    }

    double getTotalPaid() {
        return totalPaid;
    }

    void calculateMonthly() {
        monthlyPayment = balance * monthlyPaymentInterest / 100;
        totalPaid += monthlyPayment;
        unpaidBalance = balance - monthlyPayment;
        interestMade = annualInterest / 1200 * unpaidBalance;
        balance = unpaidBalance + interestMade;
    }

    boolean calculateMinimumMonthlyPayment(double monthlyPaymentRate) {
        for (int trial = 1; trial < 12; ++trial) {
            unpaidBalance = balance - monthlyPaymentRate;
            interestMade = annualInterest / 1200 * unpaidBalance;
            balance = unpaidBalance + interestMade;
        }
        return balance >= 0;
    }
}
