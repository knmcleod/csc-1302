/**
Programmer: Kerra McLeod
Program: 19.15
Date: 11/12/2020
Description: This program will read a file and print how many words have a certain length
*/
import java.util.*;
import java.io.*;
import java.util.stream.Stream;  
import java.util.stream.Collectors;
public class GroupPrint
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("Programmer: Kerra Mcleod \nThis program will read a file and print how many words have a certain length [length, How many words have said length]");
      String fileName = "test.txt";
      Map<Integer, Long> result = new TreeMap<>();
      try(Scanner in = new Scanner(new File(fileName)))
      {
         List<String> wordList = new ArrayList<>();
         while(in.hasNext())
         {
            wordList.add(in.next());
         }
      Stream<String> words = wordList.stream();
      result = words.collect(
                     Collectors.groupingBy(
                     w -> w.length(),
                     Collectors.counting()));
      }
      System.out.println("Word counts in: " +  fileName);
      System.out.println(result);
   }
}