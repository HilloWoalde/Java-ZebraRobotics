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
public class BChallenge6Pay {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("What is your pay per hour?");
        int pay = text.nextInt();
        System.out.println("What is your hours worked per week?");
        int time = text.nextInt();
        System.out.println("Pay per week: " + pay*time);
        System.out.println("Pay per month: " + pay*time*4);
        System.out.println("Pay per year: " + pay*time*52);

    }
}
