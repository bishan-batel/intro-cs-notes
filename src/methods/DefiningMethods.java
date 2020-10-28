import java.util.ArrayList;

/* 
* Program to show modularizing your code through defining methods
*/
public class DefiningMethods {

  public static String quirk(String name) {
    String msg = name + ": I'm so quirky 🤪🤡☕";
    return msg;
  }

  public static int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public static void main(String[] args) {
    String name = "Mekala";
    String quirkifiedMekala;

    quirkifiedMekala = quirk(name);
    System.out.println(quirkifiedMekala);

    System.out.println(add(2, 3));
  }

  public static int addSum(int... num) {
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      sum += num[i];
    }
    return sum;
  }
}
