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
public class TimeConverter {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter hour to convert to seconds: ");
        int hours = scan.nextInt() * 60 * 60;
        System.out.print("Enter minutes to convert to seconds: ");
        int minutes = scan.nextInt() * 60;
        System.out.print("Enter seconds to convert to seconds: ");
        int seconds = scan.nextInt();
        System.out.println((hours + minutes + seconds) + " seconds");
    }
}
