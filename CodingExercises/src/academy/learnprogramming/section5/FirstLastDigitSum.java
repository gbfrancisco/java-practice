package academy.learnprogramming.section5;

public class FirstLastDigitSum {
  public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
      return -1;
    }

    String numStr = Integer.toString(number);
    int firstDigit = Integer.parseInt(numStr.charAt(0) + "");
    int lastDigit = Integer.parseInt(numStr.charAt(numStr.length() - 1) + "");;

    return firstDigit + lastDigit;
  }

  public static void main(String[] args) {
    System.out.println(sumFirstAndLastDigit(-10));
  }
}
