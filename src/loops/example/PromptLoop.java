package example;

import java.util.Scanner;

public class PromptLoop {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int input;

    int counter = 0;
    while (counter < 10) {
      System.out.print("Enter a number: ");
      input = kb.nextInt();
    }
  }
}