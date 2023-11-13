/**
Programmer: Kerra McLeod
Program: 10.2
Date: 10/21/20
Description: A coin with a monetary value.
*/
public class Coin implements Comparable<Coin>
{
   private double value;
   private String name;
   /**
      Constructs a coin.
      @param aValue the monetary value of the coin
      @param aName the name of the coin
   */
   public Coin(double aValue, String aName)
   {
      value = aValue;
      name = aName;
   }

   /**
      Gets the coin value.
      @return the value
   */
   public double getValue()
   {
      return value;
   }

   /**
      Gets the coin name.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
     Returns a string representation of the object.
     @return name and value of coin
   */
   public String toString()
   {
      return "[Coin: " + name + "(" + value + ")]\n";
   }
   /**
      Compares two arrays
      @param coin object
      @return result
   */
   public int compareTo(Coin coin) 
   {
      int result = 0;

      if (this.value > coin.getValue()) 
      {
        result = 1;
      } 
      else if (this.value < coin.getValue()) 
      {
        result = -1;
      } 
      else if (this.value == coin.getValue()) 
      {
        result = 0;
      }

      return result;
   }

}