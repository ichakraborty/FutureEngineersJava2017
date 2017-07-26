/* Isha Chakraborty
7/25/17 */

/* Requirements:

- INDENTING
- CamelCase (for a class), camelCase (for a method/variable)
- 2 blank lines printed in the terminal before and after your output
- for global variables, declare after the class, initialize in constructor, do calculations
- main method: makes instance (object) of the class + calls the run method
- run method: calls 2 other methods
- write method to calculate how many days left in summer with 3 total months with 30 days each
- write method to talk about you (4 sentences)
    - name, school. what you did this summer (2 cool things). what you want to accomplish in java.

method header: public returnType nameOfMethod(parameters) {}
calling a method: nameOfMethod();

*/

public class SummerVacation
{
      private int totalDays, daysLeft, daysPassed;
      private String name, summerPlans, whyJava;

      public SummerVacation()
      {
          totalDays = 0;
          daysLeft = 0;
          daysPassed = 55;
      }

      public static void main(String[] args)
      {
          SummerVacation sv = new SummerVacation();
          sv.run();
      }

      public void run()
      {
          daysLeft();
          aboutMe();
      }

      public void daysLeft()
      {
          int daysInMonth = 30;
          int numMonth = 3;
          totalDays = daysInMonth * numMonth;
          daysLeft = totalDays - daysPassed;

          System.out.println("There are " + daysLeft + " days left in summer.");
      }

      public void aboutMe()
      {
          name = "My name is Isha Chakraborty, and I go to Monta Vista. "
          summer = "This summer I went to a wedding in Arizona. "
          whyJava = "I love learning Java because I can make my own applications. "
      }
}
