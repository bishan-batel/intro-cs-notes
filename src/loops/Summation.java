/* 
Summation Loop Test
Details:
  Create a program returns the sum of all integers from 1 to a user specified upper bound
  ex:
    user entered #: 4
    calculates sum of integers between 1-4
      1 + 2 + 3 + 4
    outputs 10
*/

import java.util.Scanner;

public class Summation {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int sum = 0; // variable container for sum
    int counter = 1;
    int upperBound;

    System.out.println("Enter a upper bound: "); // Queries user for upper bound
    upperBound = kb.nextInt(); // Stores uesr input to 'upperBound'

    // Loops through every integer between 1 and user defined upperBound
    while (counter <= upperBound) {
      sum = sum + counter; // Adds current count to previous sum and stores back to sum
      counter += 1; // Counts up counter variable
    }
    System.out.println(sum); // Outputs final sum

    // 1 + 3 + 4
    // 1 2 3 4
    // 1 _ _ x
    // x = (4 + (3 + (2 + 1)) )
  }
}