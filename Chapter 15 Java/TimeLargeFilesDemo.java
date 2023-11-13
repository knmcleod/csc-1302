/**
Programmer: Kerra McLeod
Program: 15.13
Date: 11/1/2020
Description: Creates Hash and Tree set, then fills them with a file and tests time differences.
*/
import java.util.*;
import java.io.*;
public class TimeLargeFilesDemo
{
   public static void main(String[] args) throws FileNotFoundException
   {
      System.out.println("Programmer: Kerra McLeod. \nThis program will create a HashSet and a TreeSet, insert a file, then output the time differences and the fastest.");
      StopWatch timerT = new StopWatch();
      Set<String> tSet = new TreeSet<String>();
      Scanner textT = new Scanner(new File("warandpeace.txt"));
      timerT.start();
      while (textT.hasNextLine()) 
      {
         String data = textT.nextLine();
         tSet.add(data);
      }
      timerT.stop();
      textT.close();
      System.out.println("TreeSet - Elapsed Time: " + timerT.getElapsedTime());
      
      StopWatch timerH = new StopWatch();
      Set<String> hSet = new HashSet<String>();
      Scanner textH = new Scanner(new File("warandpeace.txt"));
      timerH.start();
      while (textH.hasNextLine()) 
      {
         String data = textH.nextLine();
         hSet.add(data);
      }
      timerH.stop();
      textT.close();
      System.out.println("HashSet - Elapsed Time: " + timerH.getElapsedTime());
      if (timerH.getElapsedTime() > timerT.getElapsedTime()) 
      {
        System.out.println("The faster Set is: TreeSet.");
      } 
      else if (timerH.getElapsedTime() < timerT.getElapsedTime()) 
      {
        System.out.println("The faster Set is: HashSet.");
      } 
      else if (timerH.getElapsedTime() == timerT.getElapsedTime()) 
      {
        System.out.println("Both Sets are equal.");
      }
   
   }
}