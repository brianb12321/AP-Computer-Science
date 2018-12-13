
package chapter.part2;
import java.util.Scanner;


public class Mileage {
    public void doStuff() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first starting mile: ");
        double m1 = s.nextDouble();
        System.out.print("Enter ending mile: ");
        double m2 = s.nextDouble();
        System.out.print("Enter number of gallons: ");
        double g = s.nextInt();
        double result = Math.abs(m2 - m1) / g;
        System.out.println("Mileage: " + result);
    }
}
