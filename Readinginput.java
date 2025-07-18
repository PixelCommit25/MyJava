import java.util.Scanner;

public class Readinginput {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("answer the following quir");
    System.out.println("Giraffe is carnivore. true/false");
    boolean ans1 = s.nextBoolean();
    System.out.println("How many Sustainable Development Goals (SDGs");
    int ans2 = s.nextInt();
    s.nextLine();
    System.out.println("Who has been appointed as new Goa's brand");
    String ans3 = s.nextLine();
    int score = 0;
    if (ans1 == false) {
      score++;
    }
    if (ans2 == 17) {
      score++;
    }

    if (ans3.equals("Namrata")) {
      score++;
    }
    System.out.println("total score=" + score);
    s.close();
  }

}