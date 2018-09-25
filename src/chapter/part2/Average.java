/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter.part2;
import java.util.Scanner;
/**
 *
 * @author briajbarn42
 */
public class Average {
    public double average() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.print("Enter third number; ");
        double num3 = scan.nextDouble();
        return (num1 + num2 + num3) / 3;
    }
}
