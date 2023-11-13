/**
Programmer: Kerra McLeod
Program: 19.11
Date: 11/17/2020
Description: This program will ask the user for a number (n) and square from 1 to n, and check which of those numbers are palindromes.
*/
import java.io.*;
import java.util.*;
import java.util.stream.Stream;  
import java.util.stream.Collectors;
import java.util.stream.IntStream; 
import java.util.function.IntPredicate;
public class PalindromePairs
{
   public static void main(String[] args)
   {
      IntPredicate predicate = argument -> new StringBuffer(String.valueOf(argument)).reverse().toString().equals(String.valueOf(argument));
      Scanner in = new Scanner(System.in);
      System.out.println("Programmer: Kerra McLeod \nThis program will ask the user for a number (n) and square from 1 to n, and check which of those numbers are palindromes.");
      System.out.println("Please enter the integer (n) you'd like to go to (recommended number: > 100).");
      int n = in.nextInt();
      List<Integer> palindrome = IntStream.range(1, n)
                                          .map(s -> (s*s))
                                          .filter(predicate)
                                          .boxed()
                                          .collect(Collectors.toList());      
      System.out.println("Squared numbers that are palindromes: " + palindrome);
   }
}