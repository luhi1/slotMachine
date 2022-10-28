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
        SlotMachine uSlotMachine = new SlotMachine();
        uSlotMachine.clear();

        System.out.println("Welcome to the slot machine! ");
        do {
            System.out.print("Type \"Roll\" to play or quit to exit: ");
            uInputStr = uInput.nextLine();
            uSlotMachine.clear();
            if (uInputStr.contentEquals("Roll")){
                uSlotMachine.roll();
                uInputStr = "";
                if (uSlotMachine.checkWin()) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Try again!");
                }
            }
        } while (!(uSlotMachine.checkWin() || uInputStr.contentEquals("quit")));
        
        uInput.close();

    }
}