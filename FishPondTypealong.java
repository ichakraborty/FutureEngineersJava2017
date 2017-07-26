// Isha Chakraborty

public class FishPondTypealong
{
    public FishPond(String nameOfFish, int ageOfFish)
    {
        System.out.println("Hi! My name is " + nameOfFish + " and I am " + ageOfFish + " years old");
        fishStatus(ageOfFish);

    }

    public static void main(String[] args)
    {
          FishPond fishOne = new FishPond("Joe", 5);
          FishPond fishTwo = new FishPond("Billy", 21);
          FishPond fishThree = new FishPond("Jesse", 35);
    }

    public void fishStatus(int ageOfFish)
    {
          if(ageOfFish <= 18)
          {
                System.out.println("I am in fish school! I love to learn everyday!\n");
          }

          else if (ageOfFish > 18 && ageOfFish < 30)
          {
                System.out.println("I have a job in the fish police force! I keep the reef safe.\n");

          }

          else
          {
                int numOfKids = (int)(Math.random()*9 + 0);
                System.out.println("I live a great life and have " + numOfKids + " baby fish\n");
          }
    }
}
