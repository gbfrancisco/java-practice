package academy.learnprogramming.section4;

public class BarkingDog {
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 0) {
      return false;
    }

    int time = hourOfDay % 24;

    return barking && (time > 22 || time < 8);
  }
}
