/*
Simple Program explaining how to loop over a setup of numbers
from a set lowerBound to a setHigherBound
ex:
range [4-9]
output: 4, 5, 6, 7, 8, 9
*/
public class Ranges {
  public static void main(String[] args) {
    // Range 2-7
    int lowerBound = 2; // Low value of range
    int upperBound = 7; // High Value of range + Ends at upper bound
    int counter = lowerBound; // Starts at Lower bound

    while (counter <= upperBound) { // Repeats until counter is less than or equal too upper bound
      System.out.println(counter);
      counter += 1; // Every time loop repeats, counter increases by 1
    }

    // Expected Output: Every integer from lowerBound -> upperBound
  }
}