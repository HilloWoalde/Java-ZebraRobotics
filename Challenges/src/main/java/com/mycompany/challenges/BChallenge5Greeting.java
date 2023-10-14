/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.challenges;
import java.util.Scanner;
/**
 *
 * @author Aidan Pereira
 */
public class BChallenge5Greeting {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = myScanner.nextLine();
        System.out.println("Hello! Nice to meet you, " + name + ".");
    }
    
}
