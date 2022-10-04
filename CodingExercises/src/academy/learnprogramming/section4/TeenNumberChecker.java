package academy.learnprogramming.section4;

public class TeenNumberChecker {
  public static boolean hasTeen(int t1, int t2, int t3) {
    boolean check1 = t1 >= 13 && t1 <= 19;
    boolean check2 = t2 >= 13 && t2 <= 19;
    boolean check3 = t3 >= 13 && t3 <= 19;

    return check1 || check2 || check3;
  }

  public static boolean isTeen(int t1) {
    return t1 >= 13 && t1 <= 19;
  }
}
