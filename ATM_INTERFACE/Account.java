import java.util.*;
import java.text.DecimalFormat;


public class Account {
    

    private int customerNummber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;
    
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat  = new DecimalFormat("'$'###,##0.00");

    public int setCustomerNumber(int customerNummber) {
        this.customerNummber = customerNummber;
       return  customerNummber;
    }

    public int getCustomerNumber(){
    return customerNummber;
    }

    public int setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
        return pinNumber;
    }

    public int getPinNumber(){
        return pinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }


    public double getSavingBalance(){
        return savingBalance;
    }

    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }

    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return savingBalance;
    }

    public void getCheckingWithdrawInput(){
        System.out.println("Checking thr Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from checking Account: ");
        double amount = input.nextDouble();

        
        if((checkingBalance - amount) >=0){
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));

        }else{
            System.out.println("Balance cannot be Negative. " + "/n");
        }

    }
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount ou want to Withdraw from your saving account: " );
        double amount = input.nextDouble();

        if((savingBalance - amount >0)){
             calcSavingWithdraw(amount);
             System.out.println("New savin Account Balance is : " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance can not be negative" + "\n");
        }
    }

    public void getCheckingDepositInput(){
        System.out.println("Checking the Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit from Checking Account: ");
        double amount = input.nextDouble();

        if((checkingBalance +amount)>=0){
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
        }else{
            System.out.println("Balance can not be negative" + "\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount ou want to Deposit in your saving account: " );
        double amount = input.nextDouble();

        if((savingBalance + amount >0)){
             calcSavingDeposit(amount);
             System.out.println("New saving Account Balance is : " + moneyFormat.format(savingBalance));
        }else{
            System.out.println("Balance can not be negative" + "\n");
        }
    }

}
