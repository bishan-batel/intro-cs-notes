/*
 Introdues / Explains Static Imports (Not needed for intro cs but just a tidbit)
 10/29/2020

 WIP On documentgation
*/

import static java.lang.Math.sin;
/* 
Staticly imported the Math.sin method directly like this allows us to bypass having
to write Math.(method_name_here)() and just use the method name without the class reference
*/

public class StaticImports {
  public static void main(String[] args) {
    double angle = 26;
    double sine = sin(angle); // Notice how we can just put sin()

    /*
     * For most / all programs you will write, you will not need to use this
     * feature/ should not. 
     */
  }
}
