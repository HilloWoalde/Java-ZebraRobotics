/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.challenges;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Aidan Pereira
 */
public class Challenge9Library {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> books = new ArrayList<ArrayList<String>>((List.of(new ArrayList<String>(List.of("Shadow and Bone","Leigh Bardugo", "Young Adult Fantasy Adventure")),new ArrayList<String>(List.of("The Hunger Games","Suzanne Collins", "Dystopian Novel")))));
        ArrayList<String> book = new ArrayList<>();
        ArrayList<String> book2 = new ArrayList<>();
        Scanner scone = new Scanner(System.in);
        String choices = "";
        Integer choice = 0;
        while (true){
            System.out.println("I, glick 1 do Z uh lizd ov bogs 2 widraw 3 debozit 4 ezgaybe zimuladion");
            choice = Integer.parseInt(scone.nextLine());
            if (choice == 1){
                System.out.println(books);
            }
            else if (choice == 2){
                System.out.println("wut bok?");
                choices = (scone.nextLine());
                {
                    for (int counter = -1; counter < books.size(); counter++) { 		      
                        if (books.get(counter).get(1).equals(choices)){
                            System.out.println("daken.");
                        }
                    }   	
                }
            }
            else if (choice == 3){
            System.out.println("wut bok?");
                choices = (scone.nextLine());
                {
                    for (int counter = -1; counter < books.size(); counter++) { 		      
                        if (books.get(counter).get(1).equals(choices)){
                            System.out.println("geven.");
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
