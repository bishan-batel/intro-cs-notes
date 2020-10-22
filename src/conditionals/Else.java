/*
Demonstration and Explanation of else and else if statements
*/

public class Else {
  public static void main(String[] args) {
    // Else Statements
    /*
     * Else statements are used always in conjuction with an if statement to run
     * code if and only if a condition did not return
     */

    int n = 3;
    if (n > 69) {// condition is false 3 is not greater than 69
      // code will run if n is less than 69
    } else {
      // code will ONLY run if top condition is false (eg. n is not less than 69)
    }

    if (n > 1) { // condition is true, 3 is greater than 1
      /*
       * code runs after code runs in these { } after the if statement, because the
       * condition was truthy, the runtime will skip the 'else' statement and continue
       * reading code after
       */
    } else {
      // code will not run because above if statement code ran
    }
    // runtime continues reading code here
  }
}
