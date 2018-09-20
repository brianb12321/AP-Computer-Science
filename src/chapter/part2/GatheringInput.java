
package chapter.part2;

import java.util.Scanner;

public class GatheringInput {
    public void doStuff() {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int guess = scan.nextInt();
        System.out.println("Your guess is: " + guess);
    }
}