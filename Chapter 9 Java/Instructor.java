/**
Programmer: Kerra McLeod
Program #: 9.11
Date: 10/15/2020
Description: subclass to person that adds an instructor and salary
*/
public class Instructor extends Person
{
   private String salary;
   /**
   constructs a instructor with a name, year of birth and salary
   @param String name, int year, String instructorSalary
   */
   public Instructor(String name, int year, String instructorSalary)
   {
      super(name, year);
      salary = instructorSalary;
   }
   /**
   Converts to string
   @return String salary
   */
   public String toString()
   {
      return super.toString() + " Instructor's salary is: " + salary + ".";
   }
}