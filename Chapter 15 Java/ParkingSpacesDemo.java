import java.util.*;
public class ParkingSpacesDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      ParkingSpaces1 ps = new ParkingSpaces1();
      System.out.println("Positive number to park, enter a Negative number to remove and zero to stop.");
      int plate = in.nextInt();
      while(plate !=0)
      {
         if(plate > 0)
         {
            ps.addCar(plate);
         }
         else if(plate < 0)
         {
            ps.removeCar(plate);
         }
         else
         {
            plate = 0;
            System.out.println("Parking Finished.");
         }
      }
   }  
}