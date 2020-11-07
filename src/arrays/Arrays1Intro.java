
/* Introduction to Arrays
  10/26/2020
*/
import java.util.Scanner;

public class Arrays1Intro {
  public static void main(String[] args) {
    /*
     * An array is essentially a list of variables of a certain datatype
     * 
     * A common use of arrays if if you require a long list of variables, but don't
     * need direct access to any specific one other than by some index (ex. first,
     * second, third)
     * 
     * Example below will be for a progame that asks for your grades & stores them
     */

    Scanner kb = new Scanner(System.in);
    int grade1, grade2, grade3, grade4;
    System.out.println("Enter a grade: ");
    grade1 = kb.nextInt();

    System.out.println("Enter a grade: ");
    grade2 = kb.nextInt();

    System.out.println("Enter a grade: ");
    grade3 = kb.nextInt();

    System.out.println("Enter a grade: ");
    grade4 = kb.nextInt();

    /*
     * Notice how these are all integer grades, and the only thing differentiating
     * them is their 'index' (1, 2, 3, & 4)
     * 
     * An issue with this is what if we want to scale our program up and include 5
     * grades, 6 grades, 420 grades, etc. To do this we would have to painstankingly
     * copy and paste and it gets very messy quickly. We can solve all these issues
     * by instead using an array
     * 
     * An array is essentially a list of variables all stored inside one.
     * 
     * grades = [52, 13, 95, 100]
     * 
     * To create an array we use the syntax:
     * 
     * variableType[] variableName; int[] gradesInt; double[] gradesDouble;
     * 
     * to assign / initilize it, we can use curly braces for the elements (Shown
     * below)
     */

    int[] grades = { 52, 13, 95, 100 };

    /*
     * To actually retrieve / use the data inside the array, we have to specify the
     * 'index' of the array we are trying to get.
     * 
     * IMPORTANT NOTE: Array indexes, like many things in computer science, start
     * their count from 0
     * 
     * If we want to retrieve lets say 52 (first element/index) of the array, we
     * would use the syntax of:
     * 
     * arrayName[index]
     */

    int firstElement = grades[0]; // 0 because we start counting from 0
    System.out.println(firstElement);

    /*
     * grades[0] tells the compiler to retrieve the value at index 0 of grades, when
     * we call grades[0] it is used / acts almost exactly like a normal variable
     * 
     * We can do things suh as asign values into that index and read values out
     */

     System.out.println(grades[1] * 0.5 ); // Prints 1/2 of grade '13'
     grades[1] = 94; // Reassigns 2nd index in list to '94';
  }
}