/*
* 'If' Conditional Statements Introduction / Review
*/

public class IfsAndConditionals {
  public static void main(String[] args) {

    // If Statements
    /*
     * 'If' statements run code if a condition is true
     */
    int n = 69;

    if (n < 420) { // If condition inside parinthesises ( ) is truthy, code will run
      /*
       * Conditional statement is checking n < 420, or is variable 'n' less than 420
       * If n is less than 420, the condition is considered 'true' or 'truthy' If the
       * condition is truthy, all code within the curly braces { } will run
       */
      System.out.println("n is greater than 3"); // Code runs because n < 420 ( 60 < 420 )
    }

    if (n < 2) { // Checks if 'n' is less than 2, because 'n' is 69, this condition is false
      /*
       * Once we run this program, you will not see 'n is less than 2', because if the
       * condition turns out to be false, it will skip all code in the curly braces {
       * } and continue after the end curly brace '}'
       */
      System.out.println("n is less than 2");
    }
    // Program resumes here after if statement skips code inside curly braces { }

    // Conditionals
    /*
     * Conditionals are expressions that can be 'truthy' or 'falsey' Expressions
     * that return a boolean (Recap: boolean is a 'true' or 'false') The expressions
     * are used as checks in 'if' statements
     * 
     * ---------------------
     * 
     * Conditional operations include: <, >, ==, !=
     * 
     * a > b --> Only Truthy if a is greater than b
     * 
     * a < b --> Only Truthy if a is less than b
     * 
     * a == b --> Only Truthy if a is equal to b
     * 
     * a != b --> Only Truthy if a is not equal to b
     */

    // Conditional Operations inside if statements
    int a = 420;
    int b = 69;

    if (a > b) {
      // Code runs if a is greater than b
    }
    if (a < b) {
      // Code runs if a is less than b
    }
    if (a == b) {
      // Code runs if a is equal to b
    }
    if (a != b) {
      // Code runs if a is not equal to b
    }

    /*
     * !--NOTE--!
     * 
     * We use '==' for equaliy instead of '=' because single '=' is already used in java
     * for asigning values to variables (ex. int e = 3)
     * Your code will not work if you put if (a = b)
     */
  }
}
