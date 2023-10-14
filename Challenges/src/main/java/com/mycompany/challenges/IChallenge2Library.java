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
class book {
    public String title;
    public String author;
    public String genre;
    public String publisher;
    public Integer pages;
    
    public book(String titl, String auth, String gen, String pub, int page) {
        title = titl;
        author = auth;
        genre = gen;
        publisher = pub;
        pages = page;
    }

public class IChallenge2Library {
    public static void main(String[] args) {
        List<book> books = new ArrayList<book>();        
        books.add(new book("Shadow and Bone","Leigh Bardugo", "Young Adult Fantasy Adventure", "Macmillan Publishers", 416));
        books.add(new book("The Hunger Games","Suzanne Collins", "Dystopian Novel", "Scholastic ", 384));
        Scanner scone = new Scanner(System.in);
        String choices = "";
        Integer choice = 0;
        String name = "";
        String author = "";
        String genre = "";
        String publisher = "";
        Integer pages = 0;
        while (true){
            System.out.println("I, glick 1 do Z uh lizd ov bogs 2 widraw 3 debozit 4 ezgaybe zimuladion 5 danate");
            choice = Integer.parseInt(scone.nextLine());
            if (choice == 1){
                System.out.println(books);
            }
            else if (choice == 2){
                System.out.println("wut bok?");
                choices = (scone.nextLine());
                {
                    //for (int counter = 0; counter < books.size(); counter++) { 		      
                        //if (books.get(counter).get(1).equals(choices)){
                            //System.out.println("daken.");
                        //}
                    //}   	
                }
            }
            else if (choice == 3){
            System.out.println("wut bok?");
            choices = (scone.nextLine());
                {
                    //for (int counter = 0; counter < books.size(); counter++) { 		      
                        //if (books.get(counter).get(1).equals(choices)){
                            //System.out.println("geven bag.");
                        //}
                    //}   	
                }
            }
            else if (choice == 4){
                break;
            }
            else if (choice == 5){
                System.out.println("wut nam?");
                name = (scone.nextLine());
                System.out.println("wut ador?");
                author = (scone.nextLine());
                System.out.println("wut gander?");
                genre = (scone.nextLine());
                System.out.println("wut pablasher?");
                publisher = (scone.nextLine());
                System.out.println("hau manny pajaz?");
                pages = Integer.parseInt(scone.nextLine());
                books.add(new book(name,author, genre, publisher, pages));
            }
        }
    }
}
}