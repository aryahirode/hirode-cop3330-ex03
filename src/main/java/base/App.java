/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        myApp.output(myApp.quotePrompt(), myApp.authorPrompt());
    }

    private String quotePrompt() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    private String authorPrompt() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }

    private void output(String quote, String author) {
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
