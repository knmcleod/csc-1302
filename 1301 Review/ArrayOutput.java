/**
Program Name:  ArrayOutput.java
Programmer:    Kerra McLeod
Assignment:    E6.1  ArrayOutput
Description:   Prints an array of ten random integers and certain combinations based on parameters.
Date:          9/30/20
*/
import java.io.*;
import java.util.*;
public class ArrayOutput
{
   public static void main(String[] args)
   {
      System.out.println("Programmer: Kerra McLeod");
      System.out.println("This program will print an array of ten random integers and its contents with certain parameters.");
      int[] list_ary = new int[10];
      createRandomArray(list_ary);
      printAll(list_ary);
      printElementAtEvenIndex(list_ary);
      printEvenElement(list_ary);
      printAllReverse(list_ary);
      printFirstLast(list_ary);
   }   
   public static void createRandomArray(int[] list_ary)
   {
      for(int i = 0; i < 10; i++)
      {
         list_ary[i] = (int)(Math.random()*10);
      }
   }
   public static void printAll(int[] list_ary)
   {
      System.out.print("Array contents: ");
      for(int i = 0; i < list_ary.length; i++)
      {
         System.out.print(list_ary[i] + " ");
      }
   }
   public static void printElementAtEvenIndex(int[] list_ary)
   {
      System.out.println("");
      System.out.print("Every element at an even index: ");
      for(int i = 0; i < list_ary.length; i= i + 2)
      {
         System.out.print(list_ary[i] + " ");
      }
   }
   public static void printEvenElement(int[] list_ary)
   {
      System.out.println("");
      System.out.print("Every even element: ");
      for(int i = 0; i < list_ary.length; i++)
      {
         if(list_ary[i] % 2 == 0)
         {
         System.out.print(list_ary[i] + " ");
         }
      }
   }
   public static void printAllReverse(int[] list_ary)
   {
      System.out.println("");
      System.out.print("Every element in reverse order: ");
      for (int i = list_ary.length - 1; i >= 0; i--) 
      { 
         System.out.print(list_ary[i]+ " ");
      }
   }
   public static void printFirstLast(int[] list_ary)
   {
      System.out.println("");
      System.out.print("The first and last element, respectively: ");
      System.out.print(list_ary[0] + " " + list_ary[list_ary.length-1]);

   }
   
}