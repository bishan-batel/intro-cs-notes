package example;

/*
  Practical use of Loops
  Project Concept:
    You are a early coder and are unable to use the now built in '*' to do multiplication
    The only mathematic operation you can use is conditionals (<, >, ==) 
    and 1st grade arithmetic (+, -)
    You are limited to these operations to make a program 
    that multiples 2 values and returns the product
*/

public class Multiplication {
  public static void main(String[] args) {
    // 3 * 2
    // 3 + 3, 2 amount of times

    // Program tries to find a * b
    int a = 2;
    int b = 4;
    int product = 0; // Value for sum

    int counter = 0;
    while (counter < b) { // repeats interior code 'b' amount of times
      product = product + a; // adds 'a' to product every time code is ran
      counter = counter + 1;
    }
    System.out.println(product); // Echos final product
  }
}
