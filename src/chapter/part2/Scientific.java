
package chapter.part2;
import java.util.Scanner;

public class Scientific {
    public void doStuff() {
        double a, b, c;
        Scanner scan = new Scanner(System.in);
        a = Math.random() * 10 + 1;
        b = Math.random() * 10 + 1;
        System.out.println("Leg (1): " + a + " leg (2): " + b);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse is " + c);
    }
}