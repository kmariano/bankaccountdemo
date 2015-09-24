/**
 * Created by koshin on 9/23/15.
 */
import java.io.*;

public class BankAccountMain {

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to ABC Bank Terminal");
        System.out.println("=============================");

        printOptions();


        Account customerAccount = new Account(0);
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        String userInput;
        do {
            userInput = br.readLine();
            userInput.trim();
            if(userInput.equals("D")) {
                System.out.println("Enter a deposit amount:");
                Integer depositAmount = new Integer(br.readLine());
                customerAccount.depositFunds(depositAmount);
                System.out.println("Your current balance is:  " + customerAccount.getBalance());
                printOptions();
            }
            else if(userInput.equals("W")) {
                System.out.println("Enter a withdrawal amount:");
                Integer withdrawalAmount = new Integer(br.readLine());
                if(withdrawalAmount > customerAccount.getBalance()) {
                    System.out.println("Sorry insufficient funds");
                } else {
                    customerAccount.withdrawFunds(withdrawalAmount);
                }
                System.out.println("Your current balance is:  " + customerAccount.getBalance());
                printOptions();
            }
            else if(userInput.equals("B")) {
                System.out.println("Your current balance is:  " + customerAccount.getBalance());
                printOptions();
            }
        } while(!userInput.equals("Q"));

    }

    public static void printOptions(){
        System.out.println("Here are your options: ");
        System.out.println("Enter 'D' for deposit");
        System.out.println("Enter 'W' for withdrawal");
        System.out.println("Enter 'B' for balance");
        System.out.println("Enter 'Q' for quit");
        System.out.println("please enter a command:");

    }
}
