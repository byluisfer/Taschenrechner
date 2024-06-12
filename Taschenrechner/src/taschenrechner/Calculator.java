/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taschenrechner;

import java.util.Scanner;

/**
 *
 * @author luisfer
 */
public class Calculator {
    
    public static void main(String[] args) {
        int x;
        int y;
        int result;
    
        
    // Division
    Scanner sc = new Scanner(System.in);
    System.out.println("Erste Zahl");
    x = sc.nextInt();
    System.out.println("Zweite Zahl");
    y = sc.nextInt();
    
    result = x / y;
    System.out.println("Ergebnis: " + result);
    }
}
