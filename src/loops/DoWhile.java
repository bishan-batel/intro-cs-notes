/* 
  Modeling DoWhile Loops in Java
*/
@SuppressWarnings("unchecked") // Ignore this
public class DoWhile {
  public static void main(String[] args) {
    /*
     * A recap on the structure of while loops, they have a while 'head', code body,
     * and conditional
     */

    boolean condition = false;

    /* 'head' to show that it is a while loop */
    while /* Conditional */ (condition) /* Brackets Contain Code Body */ {

    }

    /*
     * Listed as instructions, this is how a while loop works
     * 
     * 1. If condition is true, continue to steps 2 & 3, if not skip to step 4 2.
     * Execute code in code body 3. Return to step 1 4. // other code outside of
     * while loop
     * 
     * Because of this, if we have a statement with an always false conditional, the
     * code will never run, because it checks the condition as soon as it runs the
     * while statement
     */

    while (false) {
      System.out.println("This message will never print out");
    }

    /*
     * The difference with a do while loop is that the instructions would look like
     * this instead:
     * 
     * 1. Run code body 2. If condition is true, go back to step 1, if not, continue
     * forward 3. // other code outside of do while loop
     */

    do {
      System.out.println("I'm inside a do while loop");
    } while (false);
    /*
     * Even though the condition is false, it will still run once because it checks
     * for the condition after it runs the body code
     */
  }
}
