import java.util.*;
public class ParkingSpaces1
{
   private Stack<Integer> driveway;
   private Stack<Integer> street;
   public ParkingSpaces1()
   {
      driveway = new Stack<>();
      street = new Stack<>();
   }
   public void addCar(int licensePlate)
   {
      if(!driveway.contains(licensePlate))
      {
         driveway.push(licensePlate);
         print();
      }
      else
      {
         System.out.println("The car " + licensePlate + " is already in the driveway");
      }
   }
   public void removeCar(int licensePlate)
   {
      if(driveway.contains(licensePlate))
      {
         int currentPlate = driveway.pop();
         if(currentPlate == licensePlate)
         {
            print();
         }
         while(currentPlate != licensePlate)
         {
            street.push(currentPlate);
            print();
            currentPlate = driveway.pop();
         }
         while(street.size() > 0)
         {
            currentPlate = street.pop();
            driveway.push(currentPlate);
            print();
         }
         
      }
     else
      {
         System.out.println("This car is not in the driveway.");
      }
    }
    public void print()
    {
      System.out.println("Cars in the driveway, starting with the first in");
      for(int i= 0; i < driveway.size(); i++)
      {
         System.out.println(driveway.get(i).toString());
      }
      System.out.println("Cars in the street, starting with the first in");
            for(int i= 0; i < driveway.size(); i++)
      {
         System.out.println(street.get(i).toString());
      }
    }
}