public class Scopes {
  public static void main(String[] args) {
    int funnyNumber = 420;

    if (true) {
      int num = 2; // Local Scope
      System.out.println(funnyNumber);
      System.out.println(num);
    }
    System.out.println(num); // <-- Would give error, num not defined in this scope

    int counter = 0;

    System.out.println(counter);

    while (counter < 10) {
      System.out.println(counter);
      counter = counter + 1;
    }

    for (int i = 0; i < 10; i = i + 1) {

    }

    for (int i = 0; i < 10; i++) {

    }

    int i = 0;
    while (i < 10) {
      i++;
    }

    System.out.println(i);
  }
}
