/* Mansi Reddy
  July 25 2017
  Project Name: IsItLunchTime.java
*/

public class IsItLunchTime {
  private int minutes = 15;

  public static void main(String[] args) {
    for(int currentMinute = 15; currentMinute >= 0 ;currentMinute--){
      System.out.println("There are " + currentMinute + " minutes left before lunch.");
    }
    System.out.println("It's lunch time");
  }
}

/*
  for(int x = 0; x <= 10; x++){
    Sytem.out.println(x);
  }
*/
