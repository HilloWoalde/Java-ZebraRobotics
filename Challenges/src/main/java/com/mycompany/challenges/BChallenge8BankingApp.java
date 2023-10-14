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
public class BChallenge8BankingApp {
    public static void main(String[] args) {
        int money = 100;
        Scanner scone = new Scanner(System.in);
        while (true){
            System.out.println("Hi, click 1 to deposit 2 to withdraw 3 to see money 4 to escape simulation");
            int choice = Integer.parseInt(scone.nextLine());
            if (choice == 1){
                System.out.println("how much to deposit?");
                choice = Integer.parseInt(scone.nextLine());
                money += choice;
            }
            else if (choice == 2){
                System.out.println("how much to withdraw?");
                choice = Integer.parseInt(scone.nextLine());
                money -= choice;
            }
            else if (choice == 3){
                System.out.println(money);
            }
            else if (choice == 4){
                break;
            }
        }
    }
}
