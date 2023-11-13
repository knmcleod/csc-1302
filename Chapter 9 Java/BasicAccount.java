/**
Programmer: Kerra McLeod
Program #: 9.9
Date: 10/15/2020
Description: A checking account has a limited number of free deposits and withdrawals.
*/
public class BasicAccount extends BankAccount
{
   private int withdrawals;

   /**
      Constructs a checking account with a zero balance.
   */
   public BasicAccount()
   {
      withdrawals = 0;
   }
   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double amount)
   {
      final int WITHDRAWAL_FEE = 30;
      
      super.withdraw(amount);  
      withdrawals++;
      if (amount > getBalance())
      {
         super.withdraw(WITHDRAWAL_FEE);
         System.out.println("Balance exceeded - $30 overdraw fee.");   
      }
      else
      {
         System.out.println("Your balance is: " + getBalance()); 
      }
   }
   /**
      Carries out the end of month processing that is appropriate
      for this account.
   */
   public void monthEnd()
   {
      withdrawals = 0;
   }
}

