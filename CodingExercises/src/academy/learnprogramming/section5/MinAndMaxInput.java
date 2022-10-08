package academy.learnprogramming.section5;

import java.util.ArrayList;
import java.util.Scanner;

public class MinAndMaxInput {
  public static void main(String[] args) {
    boolean isFirstInput = true;
    Scanner scanner = new Scanner(System.in);
    int currentMin = 0;
    int currentMax = 0;
    while (true) {
      System.out.println("Enter number:");
      if (!scanner.hasNextInt()) {
        System.out.println("bullshit");
        break;
      }

      int number = scanner.nextInt();

      if (isFirstInput) {
        currentMin = number;
        currentMax = number;
        isFirstInput = false;
      }

      if (number < currentMin) {
        currentMin = number;
      }

      if (number > currentMax) {
        currentMax = number;
      }

      scanner.nextLine();
    }
    scanner.close();
    System.out.println("Min: " + currentMin + " Max: " + currentMax);
  }
}
