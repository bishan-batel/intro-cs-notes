/* 
Program shows explanation of how arrays are stored inside memory
11/6/2020
*/

public class Arrays3wMemory {

  public static void main(String[] args) {

    /*
     * When we create an array, we need to specify the length & type of data the
     * array requires.
     * 
     * We need to specify the length because an array's size isn't dynamic, which is
     * to say the size of the array never changes. When you create a new array of,
     * lets say, integers with a length of 6, it allocates 4 + 4*6 (56) bytes of ram
     * for that array.
     */

    int[] testName = new int[6];

    /*
     * The reason why it is 28 and not 24 is because the first 4 bytes of the array
     * contain an integer that describes the array length, so in reality this array
     * contains 7 integers.
     * 
     * The program uses the length of the array to know when to stop reading the
     * array / when the array ends
     * 
     *
     */

    /*
     * Visual Representation of ram:
     * 
     * 0000 0000 0000 0110 <-- First 4 bytes used to store length of array
     * 
     * 0000 0000 0000 0000 <-- Index 0 of array
     * 
     * 0000 0000 0000 0000 <-- Index 1 of array
     * 
     * 0000 0000 0000 0000 <-- Index 2 of array
     * 
     * 0000 0000 0000 0000 <-- Index 3 of array
     * 
     * 0000 0000 0000 0000 <-- Index 4 of array
     * 
     * 0000 0000 0000 0000 <-- Index 5 of array
     */
  }
}
