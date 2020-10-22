/* 
Summation Loop Test
Details:
  Create a program returns the sum 
*/

import java.util.Scanner;

public class Summation {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int sum = 0;
    int counter = 0;
    int upperBound;

    upperBound = kb.nextInt();
    while (counter <= upperBound) {
      if (counter != 2) {
        sum = sum + counter;
      }
      counter += 1;
    }
    System.out.println(sum);

    // 1 + 3 + 4
    // 1 2 3 4
    // 1 3 _ x
    // x = (4 + (3 + (2 + 1)) )

  }
}