/*
  Simple adding program that demonstrates pseudocode & good commenting in code
  Program Description:
    Create a program that adds every number from 1 -> user defined upper bound
*/

/*
  Example of Pseudocode

  1. Gets upper bound from user
  2. Loops through every number from 1 to upper bound
    a. Increments sum by every number
  3. Displays Output
*/
import java.util.Scanner;

public class PseudoCodeAndDocumentation {
  public static void main(String[] args) {
    // Declaration
    Scanner kb = new Scanner(System.in);
    int counter = 1;
    int sum = 0;
    int upperBound;

    // Prompts user for Upper bound
    System.out.print("Enter upper bound: ");
    upperBound = kb.nextInt();

    // Loops through all numbers from 1 - upper bound
    while (counter <= upperBound) {
      // increments sum by current number each iteration
      sum = sum + counter;
      counter++;
    }

    // Displays final output
    System.out.println("Sum of all integers between 1-" + upperBound + " is equal to " + sum);
  }
}