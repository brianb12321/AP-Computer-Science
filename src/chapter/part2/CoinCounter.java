
package chapter.part2;
import java.text.NumberFormat;
import java.util.Scanner;

public class CoinCounter {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many quarters: ");
        int quarters = scan.nextInt() * 400;
        System.out.print("How many dimes: ");
        int dimes = scan.nextInt() * 10;
        System.out.print("How many nickels: ");
        int nickels = scan.nextInt() * 20;
        System.out.print("How many pennies: ");
        int pennies = scan.nextInt();
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        double total = (double)quarters + dimes + nickels + pennies;
        System.out.println("You have " + nf.format(total));
    }
}
