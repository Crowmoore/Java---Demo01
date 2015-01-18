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
public class Tehtava3 {
    
    public static void main(String args[]) {
        float userDistance;
        float gasPerKm = 0.0702f;
        float gasPrice = 1.595f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many kilometers did you travel? ");
        userDistance = scanner.nextFloat();
        float totalGas = userDistance * gasPerKm;
        System.out.print("Your trip took " + totalGas + " litres of gas and it cost " + (totalGas * gasPrice) + " euros ");
    }
    
}
