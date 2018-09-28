
package chapter.part2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HeronsForm {
    public void doStuff() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double s1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double s2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double s3 = scanner.nextDouble();
        //Get s
        double s = (s1 + s2 + s3) / 2;
        //Compute using Heron's formula
        double a = Math.sqrt(s * ((s - s1) * (s - s2) * (s - s3)));
        //Truncate decimal
        DecimalFormat df = new DecimalFormat("0.###");
        System.out.println("The area is " + df.format(a));
    }
}
