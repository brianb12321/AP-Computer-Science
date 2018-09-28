
package chapter.part2;
import java.util.Scanner;

public class Distance {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scan.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scan.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scan.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scan.nextInt();
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(d);
    }
}
