/**
Programmer: Kerra McLeod
Program: 14.16
Date: 10/21/20
Description: Creates person object
*/
public class Person implements Comparable
{
   private String name;
   /**
   Constructs a person with a name
   */
   public Person(String name)
   {
      this.name = name;
   }
   /**
   Constructs a person who's name is null
   */
   public Person()
   {
      name = null;
   }
   /**
   Gets name of person
   @return String name
   */
   public String getName()
   {
      return name;
   }
   /**
   Sets name of person
   @param aName name of person
   */
   public void setName(String aName)
   {
      name = aName;
   }
   /**
   Compares two names
   @param other person object
   @return int -1,0, or 1 based on names place compared to other.name
   */
   public int compareTo(Object otherObject)
   {
      Person other = (Person) otherObject;
      return name.compareTo(other.name);
   }
   /**
   Converts name to string
   @return String name
   */
   public String toString()
   {
      return name;
   }
}