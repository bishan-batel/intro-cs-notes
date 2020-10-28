import java.util.Scanner;

// No comments on this yet, still WIP

public class StringMethods {
  public static void main(String[] args) {

    Scanner kb = new Scanner(System.in);
    String input;

    System.out.println("Enter a y/n: ");
    input = kb.nextLine();

    char reply = input.charAt(0);
    if (reply == 'y') {
      System.out.println("lol yes");
    } else if (reply == 'n') {
      System.out.println("lol nah");
    } else {
      System.out.println("enter something right dipshit");
    }
  }
}
