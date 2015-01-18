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
public class Tehtava8 {
    
    public static void main(String args[]) {
        
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert 5 integers: ");
        for (int i=0; i<=4; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i=4; i>=0; i--) {
            System.out.print(numbers[i] + " ");
        }    
        
    }
    
}
