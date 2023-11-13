/**
Programmer: Kerra McLeod
Program #: 9.11
Date: 10/15/2020
Description: subclass to person that adds a student and major
*/
public class Student extends Person
{
   private String major;
   /**
   constructs student with a name, year and major
   @param String name, int year, String myMajor
   */
   public Student(String name, int year, String myMajor)
   {
      super(name, year);
      major = myMajor;
   }
   /**
   Converts to string
   @return String major
   */
   public String toString()
   {
      return super.toString() + " My major is: " + major + ".";
   }
}