package academy.learnprogramming;

public class Main {

  public static void main(String[] args) {

    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;

    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
    System.out.println("Busted MIN value = " + (myMinIntValue - 1));

    int myMaxIntTest = 2_147_483_647;

    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte MIN value = " + myMinByteValue);
    System.out.println("Byte MAX value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short MIN value = " + myMinShortValue);
    System.out.println("Short MAX value = " + myMaxShortValue);

    long myLongValue = 100L;
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long MIN value = " + myMinLongValue);
    System.out.println("Long MAX value = " + myMaxLongValue);

    int myTotal = (myMinIntValue / 2);

    byte myNewByteValue = (byte) (myMinByteValue / 2);

    short myNewShortValue = (short) (myMinShortValue / 2);
  }
}
