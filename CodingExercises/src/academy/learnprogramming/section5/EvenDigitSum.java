package academy.learnprogramming.section5;

public class EvenDigitSum {
  public static int getEvenDigitSum(int number) {
    if (number < 0) {
      return -1;
    }

    int evenDigitSum = 0;
    int currentDigit = 0;
    while (number > 0) {
      currentDigit = number % 10;
      if (currentDigit % 2 == 0) {
        evenDigitSum += currentDigit;
      }
      number /= 10;
    }

    return evenDigitSum;
  }

  public static void main(String[] args) {
    System.out.println(getEvenDigitSum(123456789));
  }
}
