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
public class BChallenge7ValidInput {
    public static void main(String[] args) {
        Scanner text = new Scanner(System.in);
        System.out.println("What is your age?");
        if (text.hasNextInt())
        {
            int age = Integer.parseInt(text.nextLine());
            System.out.println("Your age is: " + age);
        }
        else
        {
            System.out.println("Error");
        }
    }
}
