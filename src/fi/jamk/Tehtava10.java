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
public class Tehtava10 {
    
    public static void main(String args[]) {
        
        int grades[] = new int[6];
        int userInput;
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<6; i++) {
            System.out.println("How many students got " + i + "?: ");
            grades[i] = scanner.nextInt();

        }
        for(int i=0; i<6; i++) {
            System.out.print(i + ":");
            for (int j=0; j<grades[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}