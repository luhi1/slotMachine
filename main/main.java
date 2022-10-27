package main;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
         * set up user input to roll slots
         * set up a list of different possibilities for all 3 "spaces" in the slot
         * machine
         * randomly select a member of the list based on low odds (not realistic odds)
         * determine if you won or not
         */
        Scanner uInput = new Scanner(System.in);

        String uInputStr = "";
        do {
            if (!uInputStr.isEmpty()) {
                System.out.println("Invalid statement.");
            }
            System.out.print("Welcome to the slot machine! Type \"Roll\" to play: ");
            uInputStr = uInput.nextLine();
        } while (!uInputStr.contentEquals("Roll"));

    }
}