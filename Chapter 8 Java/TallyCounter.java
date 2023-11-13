/**
Programmer: Kerra McLeod
Program #: 8.2
Date: 10/7/2020
Description: creates limit and admits people with a limit
*/
public class TallyCounter
{
   private int value;
   private int limit;
   public TallyCounter()
   {
      limit = 0;
      value = 0;
   }
   /**
   Description sets limit
   @param: Limit, limit set for how many people can be admitted
   */
   public int setLimit(int Limit)
   {
      limit = Limit;
      return limit;
   }
   /**
   Description: checks if person can be admitted based on limit
   @param Value, admits people using value
   */
   public void admitPerson(int Value, int Limit)
   {
      value = Value;
      this.limit = Limit;
      if(limit < value)
      {
         System.out.println("Limit exceeded - no one admitted");
         value = 0;
      }
      
   }
   /**
   Converts to string
   @return string
   */
   public String toString()
   {
      return "You admitted " + value + " people. ";
   }
}