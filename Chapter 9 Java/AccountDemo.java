/**
Programmer: Kerra McLeod
Program #: 9.9
Date: 10/15/2020
Description: This program simulates a bank with checking and savings accounts.
*/
import java.util.Scanner;
public class AccountDemo
{
   public static void main(String[] args)
   {
      System.out.println("Programmer: Kerra McLeod \nThis program will deposit, withdraw, and show balances in bank accounts.");
      final int ACCOUNTS_SIZE = 10;
      BankAccount[] accounts = new BankAccount[ACCOUNTS_SIZE];
      for (int i = 0; i < accounts.length; i++)
      {      
         accounts[i] = new BasicAccount();
      }
      Scanner in = new Scanner(System.in);
      boolean done = false;
      while (!done)
      {
         System.out.print("D)eposit  W)ithdraw  M)onth end  Q)uit: "); 
         String input = in.next();
         if (input.equals("D") || input.equals("W")) // Deposit or withdrawal
         {
            System.out.print("Enter account number (Account numbers may be between 1-10): ");
            int num = in.nextInt();
            System.out.print("Enter amount: ");
            double amount = in.nextDouble();

            if (input.equals("D")) { accounts[num].deposit(amount); }
            else { accounts[num].withdraw(amount); }

            System.out.println("Balance: " + accounts[num].getBalance());
         }
         else if (input.equals("M")) // Month end processing
         {
            for (int n = 0; n < accounts.length; n++)
            {
               accounts[n].monthEnd();
               System.out.println(n + " " + accounts[n].getBalance());
            }
         }
         else if (input.equals("Q"))
         {
            done = true;
         }
      }
   }
}
