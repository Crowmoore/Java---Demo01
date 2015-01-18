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
public class Tehtava6 {
    
    public static void main(String args[]) {
        
        int userNumber = -1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert some integers! Exit with 0.");
        while (userNumber != 0) {
            userNumber = scanner.nextInt();
            sum = sum + userNumber;
            }
        System.out.print("Total sum is: " + sum);
        }
        
    }