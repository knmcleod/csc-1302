/**
Program Name:  CalculateTip.java
Programmer:    Kerra McLeod
Assignment:    E3.19 CalculateTip
Description:   Prompts user for bill amount, giving tip amount, tip percent, and final bill based on satisfaction level.
Date:          9/30/20
*/
import java.util.*;
import java.io.*;
public class CalculateTip
{
   public static void main(String[] args)
   {
      System.out.println("Programmer: Kerra McLeod.");
      System.out.println("This Program will determine recommended tip based on customer satisfaction.");
      double bill_amount = 0;
      double bill_w_tip = 0;
      int satisfaction_level = 0;
      double tip_percent = 0;
      double tip = 0;
      Scanner in = new Scanner(System.in);
      System.out.println("What was the amount of the bill?");
      bill_amount = in.nextDouble();
      System.out.println("What's your satisfaction level with the diner? Enter 1 for totally satisfied, 2 for satisfied, and 3 for dissatisfied.");
      satisfaction_level = in.nextInt();
      if(satisfaction_level == 1)
      {  
         tip_percent = .20;
         tip = bill_amount*tip_percent;
      }
      else if(satisfaction_level == 2)
      {
         tip_percent = .15;
         tip = bill_amount*tip_percent;
      }
      else if(satisfaction_level == 3)
      {
         tip_percent = .1;
        tip = bill_amount*tip_percent;
      }
      else
      {
         System.out.println("Please enter 1, 2, or 3 for satisfaction level, otherwise no tip will be calculated.");
      }
      System.out.printf("Your bill without tip is: %.2f \n", bill_amount);
      System.out.println("Your satisfaction level is: " + satisfaction_level);
      System.out.printf("Your tip percentage is %.0f percent \n", tip_percent*100);
      System.out.printf("Your tip amount is: $%.2f \n", tip);
      System.out.printf("Your total bill is: $%.2f", bill_amount+tip);
   }
}