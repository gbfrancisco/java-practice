package academy.learnprogramming;

public class Main {

  public static void main(String[] args) {
    double step1 = 20.00d;
    double step2 = 80.00d;
    double step3 = step1 + step2 * 100.00d;
    double step4 = step3 % 40.00d;
    boolean step5 = step4 == 0;
    System.out.println(step5);
    if (!step5) {
      System.out.println("Got some reminder");
    }
  }
}
