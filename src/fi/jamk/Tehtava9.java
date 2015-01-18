/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.jamk;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author h3090
 */
public class Tehtava9 {
    
    public static void main(String args[]) {
        
        int scores[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert scores: ");
        for (int i=0; i<=4; i++) {
            scores[i] = scanner.nextInt();
        }   
        Arrays.sort(scores);
        System.out.print(scores[1] + scores[2] + scores[3]);
    }
    
}
