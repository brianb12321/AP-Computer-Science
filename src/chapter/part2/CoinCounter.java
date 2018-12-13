
package chapter.part2;
import java.text.NumberFormat;
import java.util.Scanner;

public class CoinCounter {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many quarters: ");
        int quarters = scan.nextInt() * 25;
        System.out.print("How many dimes: ");
        int dimes = scan.nextInt() * 10;
        System.out.print("How many nickels: ");
        int nickels = scan.nextInt() * 5;
        System.out.print("How many pennies: ");
        int pennies = scan.nextInt();
        int cents = quarters + dimes + nickels + pennies;
        double dollar = cents / 100.0;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.println("You have " + nf.format(dollar));
    }
}
