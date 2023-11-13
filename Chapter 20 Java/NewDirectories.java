/**
Programmer: Kerra McLeod
Program: 20.9
Date: 11/22/2020
Description: Prompts user for new directory and file name, then creates a directory and file based off it.
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.File;
public class NewDirectories
{
   public static void main(String [] args) throws Exception 
   {
      System.out.println("Programmer: Kerra McLeod. \nThis program will prompt the user for a new directory and file name, then creates it.");
      Scanner in = new Scanner(System.in);
      System.out.println("Please enter directory you'd like your file in (Note: no need to add C:): ");
      String direct = in.next();
      System.out.println("Please enter file name in .txt form (Example: text.txt): ");
      String fileName = in.next();
      String path = "C:" + File.separator + direct + File.separator + fileName; 
      createDirAndFile(path);
   }
   /**
   Description: uses path given by user to create directory and file.
   @param String path, path given by user
   */
   public static void createDirAndFile(String path) throws IOException 
   {
      try
      {
         File file = new File(path);
         if(!file.exists())
         {
            file.getParentFile().mkdirs();
            file.createNewFile();
            System.out.println("Directory and File successfully created. To test, check: " + path);
         }
         else
         {
            System.out.println("Error: File already exist.");
         }
      }
      catch(IOException e)
      {
         System.out.println("An error occurred.");
      }
   }
      
}
