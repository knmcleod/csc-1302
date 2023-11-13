/**
Programmer: Kerra McLeod
Program #: 9.11
Date: 10/15/2020
Description: Tests person super class and student/instructor subclasses.
*/
public class PersonDemo
{
   public static void main(String[] args)
   {
      Person person = new Person("Danny", 1967);
      Person student = new Student("Kerra", 2002, "Computer Science");
      Person instructor = new Instructor("Mrs. Jackson", 1990, "$200k");
      System.out.println("Programmer: Kerra McLeod \nThis program will use super and sub classes.");
      System.out.println(person);
      System.out.println(student);
      System.out.println(instructor);
   }
}