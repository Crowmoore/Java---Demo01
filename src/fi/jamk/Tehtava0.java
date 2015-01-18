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
public class Tehtava0 {
    
    public static void main(String args[]) {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1: System.out.println("One");
                    break;
                case 2: System.out.println("Two");
                    break;
                case 3: System.out.println("Three");
                    break;
                default: System.out.println("Nope");
            }
    }
    
}
