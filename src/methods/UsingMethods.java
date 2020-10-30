import java.lang.Math;

/* 
 * Import, In your actual program you  do not need to 
 * actually need to import math because it is a special
 * type of java 'class'
 * 
 * 
 * Because it lives in 'java.lang', its prebuilt into the java langauge
 * so you dont need to import it everytime you use it. You can import any java.lang
 * class into your program and it will run fine, just know that its redudant code
 * 
 * This is different than a scanner, which is part of 'java.util' meaning 
 * its not automatically imported, there for we are required to import it.
 */
public class UsingMethods {
  public static void main(String[] args) {

    int n = -4;
    int result;
    
    /*
     * To call the new methods that java.lang.Math presents us, we must use the
     * syntax of the class name ('math') and name of the methods
     * 
     * For example
     */

    result = Math.abs(-2);

    /*
     * This tells the compiler to run the method 'abs' located in the class 'Math',
     * and then pass in the argument '-2'
     * 
     * Different methods have different required arguments & return types. A return
     * of a method is whatever that method throws back to us. For example,
     * kb.nextInt(); is a method that returns us an integer that the user inputs.
     * 
     * An argument is whatever you pass into the method. An example is just the math
     * functions Math.abs(2);
     * 
     * Note that if you do not give a method the arguments it was expecting, it will
     * give an error / not compile.
     * 
     * result = Math.abs(); <-- Would give an error because Math.abs() expects a
     * double or integer as a input.
     * 
     * Note that arguments are required, but using the return is not.
     */

    Math.abs(4);

    /*
     * The above code will run with no errors because the only requirements for a
     * method to work is that you give it the proper arguments.
     * 
     * If you don't use the return value, it just spits the value to the æther.
     * 
     * Another example is when you do kb.nextLine() and don't store the value.
     */

    /*
     * To pass in multiple arguments into a method, you seperate each argument with
     * a ','
     */

    result = Math.min(2, 3); // Takes in two arguments (2, 3) and returns the minimum of those two values (2)
  }
}