/* Isha Chakraborty
7/25/17
Program Name: DingDong.java
*/
import java.util.Scanner;

public class DingDong
{
    private String sisterName, brotherName, mailman, mom, dad, crab;

    public DingDong()
    {
        sisterName = "Anna";
        brotherName = "Tashi";
        mailman = "Jim";
        mom = "Mom";
        dad = "Father";
        crab = "Arnav";
    }

    public static void main(String[] args)
    {
        DingDong dd = new DingDong();
        dd.run();
    }

    public void run ()
    {
        checkTheDoor();
    }

    public void checkTheDoor()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Who's at the door?");

        String name = sc.next();

        if(name.equals(crab) || name.equals(brotherName) || name.equals(mom) || name.equals(dad))
        {
            System.out.println("Hi " + name + " you can come in.");
        }

        else if(name.equals(mailman))
        {
            System.out.println("Please leave the mail at the door");
        }

        else
        {
            System.out.println("Sorry " + name + " you can't come in");
        }


        /*
              visitor = sisterName

              the computer only sees "Anna" as binary

              visitor.equals("Anna")

        */


    }
}
