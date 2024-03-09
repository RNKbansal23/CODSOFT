import java.util.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.text.DecimalFormat;


public class Options extends Account {
    Scanner menuInput = new Scanner(System.in);
    DecimalFormat  moneyformat  = new DecimalFormat("'$'###,##0.00");
    
   HashMap<Integer , Integer> data = new HashMap<Integer , Integer>();

   public void getlogin() throws IOException {
    int x = 1;
    do{
        try {
            data.put(92141, 191904);    //1. customer number and  pin 
            data.put(989947, 71976);   //2 customer number and pin

            System.out.println("Welcome to the ATM Interface");
            System.out.println("Enter your account number");
            setCustomerNumber(menuInput.nextInt());

            System.out.println("Enter the pin nnumber: ");
            setPinNumber(menuInput.nextInt());

        }catch (Exception e){
            System.out.println("\n" + "Invalid Charcter(s). Only Numbers." + "\n");
            x=2;
        }


        int cn = getCustomerNumber();
        int pn = getPinNumber();
        if (data.containsKey(cn) && data.get(cn) == pn) {
            getAccountType();

        }else
           System.out.println("\n" + "Wrong Customer Number or Pi Number" + "\n");

    }while (x==1 );
    
   }

   
   public void getAccountType(){
    System.out.println("Selext the Account you want to access: ");
    System.out.println("Type 1 - Checkng Account" );
    System.out.println("Type 2 - Saving Account" );
    System.out.println("Type 3 - Exit" );

    int selection =  menuInput.nextInt();

    switch (selection) {
        case 1:
            getChecking();
            break;

        case 2:
            getSaving();
            break;    
        case 3:
            System.out.println("Thnk you for using this ATM, Bye  \n");          
        default:
            System.out.println("\n" + "Invalid Choice" + "\n");
            break;
    }

   }

   public void getChecking(){

    System.out.println("Checking Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit");
    System.out.println("Choice: ");

    int selection = menuInput.nextInt();

    switch (selection) {
        case 1:
            System.out.println("Checking Account Balance" + moneyformat.format(getCheckingBalance()));
            getAccountType();
            break;
        case 2:
            getCheckingWithdrawInput();
            getAccountType();
            break;
        case 3:
            getCheckingDepositInput();
            getAccountType();
            break;    
        case 4:
            System.out.println("Thank You for using this Atm , bye.");    
    
        default:
        System.out.println("\n" + "Invaid Choice" + "\n");
            getChecking();
    }
   }

   public void getSaving(){
    System.out.println("Saving Account: ");
    System.out.println("Type 1 - View Balance");
    System.out.println("Type 2 - Withdraw Funds");
    System.out.println("Type 3 - Deposit Funds");
    System.out.println("Type 4 - Exit"); 
    System.out.println("Chice:  ");

    int selection  = menuInput.nextInt();

    switch (selection) {
        case 1:
            System.out.println("Saving Account Balance: " + moneyformat.format(getSavingBalance())); 
            break;


        case 2:
             getSavingWithdrawInput();
             getAccountType();
        break;


        case 3:
             getSavingDepositInput();
             getAccountType();
             break;


        case 4:
             System.out.println("Thank you for using this ATM, Bye. "); 
             break;


        default:
             System.out.println("/n" + "Invalid choice" + "\n");    //have to check this
            break;
    }
   }


}