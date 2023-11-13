/**
Programmer: Kerra McLeod
Program #: 9.11
Date: 10/15/2020
Description: Creates a person with a name and year of birth
*/
public class Person
{
   private String name;
   private int yob;
   /**
   Constructs a person
   @param String name and int year
   */
   public Person(String name, int year)
   {
      this.name = name;
      yob = year;
   }
   /**
   Converts to string
   @return String name and yob(year of birth).
   */
   public String toString()
   {
      return "Name: " + name + ". Birth year: " + yob + ".";
   }
   /**
   gets name when called
   @param String name
   @return String name
   */
   public String getName(String name)
   {
      return name;
   }
   /**
   gets date of birth when called
   @param int yob
   @return int yob
   */
   public int getDob(int yob)
   {
      return yob;
   }
}