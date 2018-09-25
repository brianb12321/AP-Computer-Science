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
        int hour = scan.nextInt();
        int minutes = hour * 60;
        int seconds = minutes * 60;
        System.out.println(minutes + " minutes");
        System.out.println(seconds + " seconds");
    }
}
