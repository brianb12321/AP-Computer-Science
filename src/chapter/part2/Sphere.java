
package chapter.part2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scan.nextDouble();
        double volume = (Math.pow(radius, 3) * Math.PI) * 4 / 3;
        double surfaceArea = (Math.PI * Math.pow(radius, 2)) * 4; 
        
    }
}