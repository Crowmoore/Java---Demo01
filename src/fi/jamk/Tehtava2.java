/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;
/**
 *
 * @author h3090
 */
public class Tehtava2 {
    
    public static void main(String args[]) {
        int userSeconds;
        int seconds;
        int minutes;
        int hours;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert the number of seconds: ");
        userSeconds = scanner.nextInt();
        if (userSeconds < 60) {
            System.out.print(userSeconds + " seconds ");
        }
        else if (userSeconds < 3600) {
            minutes = userSeconds / 60;
            seconds = userSeconds % 60;
            System.out.print(minutes + " minutes " + seconds + " seconds ");
        }
        else if (userSeconds >= 3600) {
            hours = userSeconds / 3600;
            minutes = (userSeconds % 3600) / 60;
            seconds = (userSeconds % 3600) % 60;
            System.out.print(hours + " hours " + minutes + " minutes " + seconds + " seconds ");
        }
    }
     
}
