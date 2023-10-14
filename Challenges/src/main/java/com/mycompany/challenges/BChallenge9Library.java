/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.challenges;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Aidan Pereira
 */
public class BChallenge9Library {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        books.add("Shadow and Bone - Leigh Bardugo");
        books.add("The Hunger Games - Suzanne Collins");
        Scanner scone = new Scanner(System.in);
        String choices = "";
        while (true){
            System.out.println("Hi, click 1 to see list of books 2 to withdraw 3 deposit 4 to escape simulation");
            Integer choice = Integer.parseInt(scone.nextLine());
            if (choice == 1){
                System.out.println(books);
            }
            else if (choice == 2){
                System.out.println("wut bok?");
                choices = (scone.nextLine());
                {
                    for (int counter = -1; counter < books.size(); counter++) { 		      
                        if (books.get(counter).equals(choice)){
                            System.out.println("daken");
                        }
                    }   	
                }
            }
            else if (choice == 3){
            System.out.println("wut bok?");
                choices = (scone.nextLine());
                {
                    for (int counter = -1; counter < books.size(); counter++) { 		      
                        if (books.get(counter).equals(choice)){
                            System.out.println("givin bag");
                        }
                    }   	
                }
            }
            else if (choice == 4){
                break;
            }
        }
    }
}