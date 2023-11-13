/**
Programmer: Kerra McLeod
Program: 10.2
Date: 10/21/20
Description: Tests Coin class and SelectionSorter.
*/
public class CoinSortDemo
{
   public static void main(String[] args)
   {
      System.out.println("Programmer: Kerra McLeod \nThis program sorts an array of coins using a selection sort algorithm.");
      Coin[] a = {new Coin(0.05, "Nickle"),
                  new Coin(0.10, "Dime"),
                  new Coin(0.01, "Penny"),
                  new Coin(0.25, "Quarter"),
                  new Coin(0.01, "Penny"),
                  new Coin(0.10, "Dime"),
                  new Coin(0.44, "Peso"),
                 };
      System.out.println("Unsorted Coins: ");
      for(int i = 0; i < a.length; i++)
      {
         System.out.print(" -- " + a[i]);
      }
      SelectionSorter.sort(a);
      System.out.println("Sorted Coins: ");
      for(int i = 0; i < a.length; i++)
      {
         System.out.print(" -- " + a[i]);
      }
   }
}