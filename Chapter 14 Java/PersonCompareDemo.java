/**
Programmer: Kerra McLeod
Program: 14.16
Date: 10/21/20
Description: Tests and prompts user for persons name, then sorts first and last.
*/
import java.util.*;
public class PersonCompareDemo
{
   public static void main(String[] args)
   {
      int count = 0;
      Scanner in = new Scanner(System.in);
      Person first = null;
      Person last = null;
      System.out.println("Programmer: Kerra McLeod \nThis program will prompt for 10 people and determine the first and last person alphabetically.");
      System.out.println("Please enter the first names of ten people.");
      for(int i = 0; i <= 9; i++)
      {
         String name = in.nextLine();
         Person p = new Person(name);
         if(first == null)
         {
            first = last = p;
         }
         else
         {
            if(first.compareTo(p) > 0)
            {
               first = p;
            }
            if(last.compareTo(p) < 0)
            {
               last = p;
            }
         }
      }
      System.out.println("First: " + first);
      System.out.println("Last: " + last);
   }
}