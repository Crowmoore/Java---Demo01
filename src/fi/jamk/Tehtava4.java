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
public class Tehtava4 {
    
    public static void main(String args[]) {
        
        int userYear;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert a year: ");
        userYear = scanner.nextInt();
        if (userYear % 400 == 0) {
            System.out.print("The year " + userYear + " is a leap year! ");
        }
        else if (userYear % 100 == 0) {
            System.out.print("The year " + userYear + " is not a leap year! ");
        }
        else if (userYear % 4 == 0) {
            System.out.print("The year " + userYear + " is a leap year! ");
        }
        else {
            System.out.print("The year " + userYear + " is not a leap year! ");
        }
    }
    
}
