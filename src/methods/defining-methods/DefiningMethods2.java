/*
 * Program to model defining methods and take in arguments
*/
public class DefiningMethods2 {

  /*
   * If you want to make a method to take in arguments to do things with them (for
   * example a math variable that calculates the square of a number), you can
   * define those required arguments by just listing them in the (), if you want
   * multiple parameters you can seperate them with ','
   */

  public static void quirkify(String firstName, String lastName) {
    /*
     * Inside here you can use the parameters as much as you want, but note that it
     * is a general bad practice to reassign anything to these variables
     * 
     * for example: if I wrote:
     * 
     * firstName = "Rofl";
     * 
     * That would be an instance of reassignment
     */
    System.out.println(firstName + " 🤪🤪🤣 " + lastName);
  }

  public static void main(String[] args) {

    quirkify("Conar", "Kumar"); // Passes those strings to the quirkify method
    quirkify("Tiffany", "Guan");
  }

}
