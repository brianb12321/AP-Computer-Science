/*
+ Addition
- Subtraction
* Multiplication
/ Division
% Modulus
^ Exponent
() Order of operation
*/

package chapter.part2;

import java.util.Scanner;
/**
 *
 * @author briajbarn42
 */
public class Arithmetic {
    public void doStuff() {
        double num1 = 27;
        double num2 = 9;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = s.nextDouble();
        System.out.print("Enter second number: ");
        num2 = s.nextDouble();
        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The difference is " + (num1 - num2));
        System.out.println("The product is " + (num1 * num2));
    }
}