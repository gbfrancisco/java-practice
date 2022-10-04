package academy.learnprogramming.section4;

public class DecimalOperator {
  public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    return (int) (num1 * 1000) == (int) (num2 * 1000);
  }

  public static void main(String[] args) {
    boolean test1 = DecimalOperator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    boolean test2 = DecimalOperator.areEqualByThreeDecimalPlaces(3.175, 3.176);
    boolean test3 = DecimalOperator.areEqualByThreeDecimalPlaces(3.0, 3.0);
    boolean test4 = DecimalOperator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

    System.out.println(test1);
    System.out.println(test2);
    System.out.println(test3);
    System.out.println(test4);
  }
}
