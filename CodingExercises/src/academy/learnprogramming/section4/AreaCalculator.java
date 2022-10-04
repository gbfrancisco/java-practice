package academy.learnprogramming.section4;

public class AreaCalculator {
  public static double area(double r) {
    if (r < 0.0d) {
      return -1.0d;
    }

    return Math.PI * Math.pow(r, 2);
  }

  public static double area(double x, double y) {
    if (x < 0.0d || y < 0.0d) {
      return -1.0d;
    }
    return x * y;
  }

  public static void main(String[] args) {
    System.out.println(area(5.0));
    System.out.println(area(5.0, 4.0));
  }
}
