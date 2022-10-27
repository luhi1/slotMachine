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
        slotMachine uSlotMachine = new slotMachine();

        while (uInputStr != "quit") {
            do {

                if (uInputStr.isEmpty()) {
                    System.out.print("Welcome to the slot machine! Type \"Roll\" to play: ");
                } else {
                    System.out.print("Type \"Roll\" to play again, or quit to leave: ");
                }

                uInputStr = uInput.nextLine();

                if (uInputStr.contentEquals("quit")) {
                    break;
                }

            } while (!uInputStr.contentEquals("Roll"));

            if (uInputStr.contentEquals("quit")) {
                break;
            }

            uSlotMachine.roll();
            if (uSlotMachine.win()) {
                System.out.println("You win!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
        uInput.close();

    }
}