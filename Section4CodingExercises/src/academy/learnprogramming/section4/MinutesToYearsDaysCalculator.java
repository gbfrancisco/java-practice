package academy.learnprogramming.section4;

public class MinutesToYearsDaysCalculator {
  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
      return;
    }

    long hour = minutes / 60;
    long day = hour / 24;
    long year = day / 365;

    System.out.println(minutes + " min = " + year + " y and " + day % 365 +" d");
  }

  public static void main(String[] args) {
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
  }
}
