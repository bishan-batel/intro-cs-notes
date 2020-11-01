/* 
* This program models an intro on how to define & use methods
!: This program can be run to help understand code
*/
public class DefineMethods1 {
  /*
   * A method is essentially a way we can reuse code in java. It is a way to
   * modularize and organize code while also having capabilities to reuse code at
   * the same time.
   * 
   * Lets say in our code, to format our output in the console, we put these
   * divider breaks in our code ('------------')
   */

  /*
   * To define a method, you require the 'public' and 'static' keyword (you'll
   * learn what this means later), a return type ('void' for this example which
   * just means we arent giving anything back in the method), and a method name,
   * and also a () (parintheses contain where you define arguments)
   */
  public static void printDivider() { // Method name is 'printerDivider'
    System.out.println("-----------");
    /*
     * Code body only includes printing out a divider line in console, this code
     * will run whenver we call the method
     */
  }

  // !NOTE: Our normaly main boilerplate code we always write, is a method, but
  // ! what makes it special is that this method contains code that the compiler
  // ! will run first
  public static void main(String[] args) {
    /*
     * To call a method, all we do is write the method name and open & close
     * parithesis
     */

    printDivider();
    /*
     * When the java runtime enviorment (JRE) gets to this line above, it will run
     * the code above
     * 
     * Note that this method can be called however many times we want
     */

    for (int i = 0; i < 1000000; i++) {
      printDivider(); // * Runs 'printDivider()' 1 million times
    }

  }
}
