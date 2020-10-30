/* 
This program models an intro on how to define & use methods

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
   * To define a method, you require the 'public keyword' (you'll learn what this
   * means later), a return type ('void' for this example which just means we
   * arent giving anything back in the method), and a method name, and also a ()
   * (parintheses contain where you define arguments)
   */
  public void printDivider() { // Method name is printDivider
    System.out.println("-----------");
  }

  public static void main(String[] args) {
    
  }
}
