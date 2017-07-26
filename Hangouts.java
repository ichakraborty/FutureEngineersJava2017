/* Isha Chakraborty
7/24/17*/

public class Hangouts // class header
{
      private int numOfHangouts, numOfSlices, numOfFriends, numOfHours;
      private double priceOfSlice, totalCost, totalFoodCost;
      private String whereIWent;
      private final  double tax;

      public Hangouts() // no parameters, constructor
      {
          numOfHangouts = 5;
          numOfSlices = 5;
          numOfFriends = 2;
          numOfHours = 4;
          priceOfSlice = 1000.00;
          totalCost = 0;
          whereIWent = " park";
          tax = 0.085;
      }

      public static void main(String[] args)
      {
          Hangouts h = new Hangouts(); // no parameters bc none in constructor
          h.run();
      }

      public void run()
      {
          int numOfHangoutsYearly = howManyHangoutsPerYear();
          totalFoodCost = costOfEating();
          System.out.print("I went to the " + whereIWent + "\n");
      }

      public int howManyHangoutsPerYear() // method header
      {
          int numOfHangoutsYearly = numOfHangouts * 12;
          System.out.print("I went on " + numOfHangoutsYearly + " hangouts this year.\n");
          return numOfHangoutsYearly;
      }

      public double costOfEating()
      {
          totalFoodCost = numOfSlices * (numOfFriends + 1) * priceOfSlice;
          totalCost = totalFoodCost + (totalFoodCost*tax);
          double change = 1000000 - totalCost;
          System.out.println("You gave me a million dollars. But I only spent $" + totalCost + ", and your change is " + change + ". I spent $" + totalFoodCost + " on pizza.\n");
          return totalFoodCost;

      }
}
