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
public class Tehtava1 {
    
    public static void main(String args[]) {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert your score: ");
        userNumber = scanner.nextInt();
        switch (userNumber) {
            case 0:
            case 1: System.out.println("Your final grade is 0");
                break;
            case 2:
            case 3: System.out.println("Your final grade is 1");
                break;
            case 4:
            case 5: System.out.println("Your final grade is 2");
                break;
            case 6:
            case 7: System.out.println("Your final grade is 3");
                break;
            case 8:
            case 9: System.out.println("Your final grade is 4");
                break;
            case 10:
            case 11:    
            case 12: System.out.println("Your final grade is 5");
                break;
            default: System.out.println("Score too high!!");
        }
    }
    
}
