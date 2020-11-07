/*
Explanation of syntax use in arrayus
11-6-2020

TODO: DOCUMENTATION
*/

import java.util.Scanenr;

public class Arrays2Syntax {
  public static void main(String[] args) {

    /*
     * To create an array we need 2 things, the syntax to let the compiler know what
     * we want is an array, and the datatype the array is going to contain
     */

    int[] intArrayName; // <-- the [] tells the compiler it wants an array of 'int's (integers)

    /*
     * If we want to actually create the array / initlize it we always need 1 thing:
     * the array size
     * 
     * The reason why we always need the array size is because whatever is running
     * the program needs to know how much memory to allocate for the variable(s) in
     * RAM
     * 
     * There are two ways we can specify the size of the array, implicitely or
     * explicitely.
     * 
     * When we define an array using the explicit method, we create the array but
     * all the values in the array are defaulted as NULL, or undefined
     */

    int[] implicitMethod = new int[60];
    /*
     * The 'new' keyword is just telling the compiler to allocate memory in a
     * differant way, You will learn more about it later but just know that there is
     * a reason and its not just arbitruary.
     * 
     * The number inside the new int[] is us explicitely telling that we want an
     * array of 60 integers.
     * 
     * NOTE All 60 of the integers have been set to, by default, to an undefined
     * value. Because the array type is an intger, all those 60 values in the array
     * default to 0
     * 
     * Key to use if you want to know what the default is
     * 
     * double -> 0.0
     * 
     * float -> 0.0f
     * 
     * integer-> 0
     * 
     * byte -> 0
     * 
     * short -> 0
     * 
     * string -> "" (Empty string)
     * 
     * char -> "" (Null termination character, binary is just 0000 0000 (all 0s) )
     */

    System.out.println(implicitMethod[0]); // <-- Would print out '0'

    /*
     * The second way is the implicit syntax, where we give the compiler value we
     * want the array to contain and the compiler just counts those values
     */

    String[] jojoQuotes = { "what", "huh", "hi" };

    /*
     * The compiler will count how many values you inputted (3) and will create an
     * array size of 3.
     */

    System.out.println(jojoQuotes[0]); // <- Prints out "what"
    System.out.println(jojoQuotes[1]); // <- Print out "huh"
    System.out.println(jojoQuotes[2]); // <- Prints out "hi"

    /*
     * When to use either:
     * 
     * The implicit form is used when want have just a handfull of values that we
     * want to input (builtin values eg. names or something)
     * 
     * The explicit form is used when we want an array of a certain size but not
     * determinte that size yet
     * 
     * Below the divider line, it will show a use of each
     */

    System.out.println("(<--IMPLICIT-->)"); // Divider line

    // Implicit
    final String[] MEKALA_QUOTES = { "what", "gross", "gremlin noises", "noises", "gremlin", "loud yelling" };

    int index = (int) (Math.random() * MEKALA_QUOTES.length);
    /*
     * Gets a random (integer) value from 0 to the length of the array (not
     * including the length, for this example it goes from 0-6, not including 6)
     */

    System.out.println(MEKALA_QUOTES[index]); // Prints out a random quote

    System.out.println("(<--IMPLICIT-->)"); // Divider line

    // Explicit
    Scanner kb = new Scanner(System.in);
    int[] names = new int[10];

    System.out.println("Enter " + names.length + " names: ");

    // For all indexes of the array, ask the user to input something for that name
    for (int i = 0; i < names.length; i++) {
      System.out.print("Enter a name: ");
      names[i] = kb.nextLine();
    }
    /*
     * Iterates through all values of the array, and prints out the value & "Im so
     * quirky doe";
     */

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + ": I'm so quirky doe");
    }
  }
}
