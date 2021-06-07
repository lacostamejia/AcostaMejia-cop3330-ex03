/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
 What is the quote? These aren't the droids you're looking for.
Who said it? Obi-Wan Kenobi
Obi-Wan Kenobi says, "These aren't the droids you're looking for."
 */


import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here is the scanner method used.

        //Variables used.
        String quote;
        System.out.print("What is the quote? ");
        quote = in.nextLine();

        String author;
        System.out.print("Who said it? ");
        author = in.nextLine();

        System.out.println(author + " says, '"  + quote +  "' ");

    }
}
