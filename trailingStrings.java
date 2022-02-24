import java.util.Scanner;

public class trailingStrings {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("================================");
    for (int i = 0; i < 3; i++) {
      String s1 = scan.next();
      int x = scan.nextInt();

      String answer = s1 + "";
      int n = s1.length();

      while (n < 15) {
        answer += " ";
        n++;
      }

      String number = Integer.toString(x);

      if (number.length() < 2) {
        answer += "00" + number;
      } else if (number.length() < 3) {
        answer += "0" + number;
      } else {
        answer += number;
      }

      System.out.println(answer);
    }

    scan.close();
    System.out.println("================================");
  }
}