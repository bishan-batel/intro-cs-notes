public class StringMethods {
  public static void main(String[] args) {

    /*
     * Important Note / Review:
     * 
     * The '.' in java is technically an operator, like a +, -, etc. The . operator
     * allows us to access properties / methods of some class. For example, in a
     * scanner, we use scanner.nextLine();, the '.' is saying find the nextLine()
     * method inside our variable, scanner.
     */

    /*
     * String methods are very simple, they are essentially just a list of methods
     * that the nice people who wrote java built into the language to make our lives
     * easier. I'm not going to go over every single method, but only the more
     * important ones.
     */

    String string = "Rofl Bob lol so funny quirky";

    /*
     * Equals Method
     * 
     * The equals() method is probaly the one you will used the most often in java,
     * it is used as an equality check between two strings. It returns a boolean
     * value, so it can be used in things such as conditional statements (if, while,
     * dowhile, etc)
     * 
     * The reason we can't used '==' to compare like other variables (int, double,
     * char, etc) is because strings are more complex data structures. int, double,
     * char, etc are all primitive data types because they always use a set amount
     * of bytes. A char will always be 1 byte, an integer will always be 32 bytes,
     * etc. This isn't the case for strings. If I have a string "lol", that takes 3
     * characters, so it is 3 bytes of data. But if I have a string "rofl", that
     * takes 4 characters, so 4 bytes od ata. Because this is variable bytecount,
     * it's more complex in memory. Because of this, it is also more complex to
     * compare the two values, hence the method. If you scroll to the bottom of this
     * .java file, I wrote my own implimentation of what / how to define an equals
     * method
     */

    if (string.equals("lol")) {
      // do stuff
    }

    /*
     * Length Method
     * 
     * The length() method is probaly the most used one, what it does is return an
     * integer for the character count in our string, for example if our string was
     * "lol", it would output 3.
     */

    int length = string.length(); // Outputs 3

    /*
     * CharAt Method
     * 
     * The charAt() method returns us a *character* at the position specified.
     * Please note that, like arrays, this position / index starts counting from 0.
     * So calling str.charAt(0); would give us the first character. Please also note
     * that even though we count from 0 using indeces, the length method counts from
     * 1. So if you want to get the last character of a string you would do str.charAt(str.length() - 1);
     */

     char c = string.charAt(3); // Outputs 'l' 
  }

  // Equals Method demo
  public static boolean equals(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false; // Can't be equal if their lengths are not
    }

    // Iterates through every index of the string (character position, 0, 1,
    // etc)
    for (int i = 0; i < str1.length(); i++) {
      if (str1.charAt(i) != str2.charAt(i)) {
        return false; // Exits method as 'false' if any characters dont match up
      }
    }

    return true; // only reaches this line if strings are equal
  }
}