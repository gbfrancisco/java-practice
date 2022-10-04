package academy.learnprogramming;

public class Main {

  public static void main(String[] args) {
    byte myByteValue = 10;
    short myShortValue = 32000;
    int myIntValue = 50;

    // No need to type cast because byte, short int fit into long
    long myLongValue = 50000L + 10L * (myByteValue + myShortValue + myIntValue);

    System.out.println(myLongValue);

    // Must type cast because you must explicitly tell Java that the values are of type short;
    short anotherShort = (short) (1000 + 10 * (myByteValue + myShortValue + myIntValue));

  }
}
