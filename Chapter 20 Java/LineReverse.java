/**
Programmer: Kerra McLeod
Program: 20.3
Date: 11/19/2020
Description: This program prompts the user for a file to reverse the contents of.
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
public class LineReverse
{
   public static void main(String[] args) throws IOException
   {
      System.out.println("Programmer: Kerra McLeod. \nThis program prompts the user for a file to reverse the contents of.");
      Scanner in = new Scanner(System.in);
      System.out.print("What is the name of the file you'd like to reverse? ");
      String filename = in.next();
      reverseLines(filename);
   }
   /**
   Description: reverses lines from a file given by user
   @param String file, input from user
   */
   public static void reverseLines(String file) throws IOException
   {
      FileInputStream fileIn = new FileInputStream(file);
      Path srcPath = Paths.get(file);
      List<String> lines = Files.readAllLines(srcPath);
      fileIn.close();
      FileOutputStream fileOut = new FileOutputStream(file);
      for(String line: lines)
      {
         for(int i = line.length() - 1; i >= 0; i--)
         {
            fileOut.write(line.charAt(i));
         }
         fileOut.write('\n');
      }
      System.out.println(file + " has been reversed.");
      fileOut.close();
   }
}