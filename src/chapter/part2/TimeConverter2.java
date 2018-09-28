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
public class TimeConverter2 {
    public void doStuff() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter seconds to convert: ");
        int seconds = scan.nextInt();
        int hours = seconds / 3600;
        int minutes = seconds % 3600 / 60;
        int resultSeconds = seconds % 3600 % 60;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + resultSeconds);
    }
}
