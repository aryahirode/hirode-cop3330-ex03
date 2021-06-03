package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
    }

    private String quotePrompt() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

}
