/**
Programmer: Kerra McLeod
Program #: 8.2
Date: 10/7/2020
Description: Demo counter that is used to admit a limited number of people
*/
import java.util.*;
public class TallyCounterDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Programmer: Kerra McLeod. \nThis program counts people admitted with a limit.");
      TallyCounter value = new TallyCounter();
      TallyCounter limit = new TallyCounter();
      System.out.println("What is the limit on how many people you'd like to admit?");
      int Limit = in.nextInt();
      limit.setLimit(Limit);
      System.out.println("How many people are you admitting? ");
      int Value = in.nextInt();
      value.admitPerson(Value, Limit);
      System.out.println(value);
   }
}