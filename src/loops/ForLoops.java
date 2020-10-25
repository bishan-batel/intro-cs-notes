/*
  Demonstration and applications of for loops
*/

public class ForLoops {
  public static void main(String[] args) {
    /*
     * A for loop is essentially just a while loop that is more compact
     * 
     * The reason why we have 'for' loops is just because programmers are lazy are
     * want to compact their code as much as possible
     */

    /*
     * Below is a common use of a 'while' loop Notice how in projects before, a
     * majority of times we use a while loop, it consists of just us wanting to
     * count from one number to another number
     * 
     * This format is almost always in the form of defining a variable before the
     * loop, checking a condition in the while() and running a piece of code
     * (counter = counter+1) at the very end of the while loop
     */
    int counter = 0;
    while (counter < 10) {
      // do some code
      counter = counter + 1;
    }

    /*
     * The purpouse of the for loop is to just combine all these 3 lines of code
     * (int counter = 0; while counter < 10; counter = counter + 1) into one single
     * line of code
     * 
     * The for statement allows us to do this by putting these inside the ( ) after
     * 'for' The three statements are seperated by 2 ';'
     * 
     * Before the first ';', we add the piece of code to define our variable (This
     * variable does not need to be an integer, but most of the time it is)
     * 
     * After the first ';', we add the condition the for loop checks each time it
     * iterates (what we would put in the ( ) in a while loop )
     * 
     * After the second ';', we add a line of code that runs at the end of the code
     * inside the loop (what we would put right before the '}' in our while loop)
     */

    for (int i = 0; i < 10; i = i + 1) {
    }
  }
}
