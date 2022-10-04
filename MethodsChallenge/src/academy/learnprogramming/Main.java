package academy.learnprogramming;

public class Main {

  private static void displayHighScorePosition(String name, int position) {
    System.out.println(name + " managed to get into position " + position + " on the high score table.");
  }

  private static int calculateHighScorePosition(int score) {
    if (score >= 1000) {
      return 1;
    } else if (score >= 500) {
      return 2;
    } else if (score >= 100) {
      return 3;
    }
    return 4;
  }

  public static void main(String[] args) {
    displayHighScorePosition("BugExploit", calculateHighScorePosition(1500));
    displayHighScorePosition("BugExploit", calculateHighScorePosition(900));
    displayHighScorePosition("BugExploit", calculateHighScorePosition(400));
    displayHighScorePosition("BugExploit", calculateHighScorePosition(50));
  }
}
