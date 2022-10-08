package academy.learnprogramming.section5;

public class NumberPalindrome {
  public static boolean isPalindrome(int number) {
    if (number < 0) {
      number *= -1;
    }

    String numStr = Integer.toString(number);

    for (int i = 0; i < numStr.length() / 2; i++) {
      if (numStr.charAt(i) != numStr.charAt(numStr.length() - i - 1)) {
        return false;
      }
    }

    return true;
  }
}