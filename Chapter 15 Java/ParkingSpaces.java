/**
Programmer: Kerra McLeod
Program: E15.10
Date: 10/28/2020
Description: Adds and removes a stack of cars to the street using the Last-In First-Out algorithm.
*/
import java.util.*;
import java.io.*;
public class ParkingSpaces 
{
   public static void main(String[] args) 
   {
      System.out.println("Programmer: Kerra McLeod. \nThis program will move cars from the driveway to street and back based on user input.");
      Scanner in = new Scanner(System.in);
      Stack<Integer> driveway  = new Stack<>();
      Stack<Integer> street  = new Stack<>();
      boolean access = false;
      while (!access) 
      {
         System.out.println("Please enter a positive number to park a car, a negative number to remove a car, and zero to stop.");
         int licensePlateNumber = in.nextInt();
         if(licensePlateNumber == 0)
         {
            access = !access;
            System.out.println("Parking finished.");
         }
         else if(licensePlateNumber > 0)
         {
            driveway.push(licensePlateNumber);
            System.out.println("The driveway now has the following cars" + driveway);
         }
         else
         {
            licensePlateNumber = -1 * licensePlateNumber;
            System.out.println("Removing car " + licensePlateNumber);
            while(driveway.peek()!= licensePlateNumber)
            {
               street.push(driveway.peek());
               driveway.pop();
            }
            driveway.pop();
            while(!street.empty())
            {
               driveway.push(street.peek());
               street.pop();
            }
            System.out.println("The driveway now has the following cars" + driveway);
         }
       
      }
   }
}