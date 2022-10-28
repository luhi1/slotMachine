package Source;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Set up user input and create a slot machine object.
        Scanner uInput = new Scanner(System.in);
        String uInputStr = "";
        SlotMachine uSlotMachine = new SlotMachine();
        uSlotMachine.clear();

        //Introduce the game.
        System.out.println("Welcome to the slot machine! ");
        do {

            //User input
            System.out.print("Type \"Roll\" to play or quit to exit: ");
            uInputStr = uInput.nextLine();
            uSlotMachine.clear();

            //Roll the slots (refer to the SlotMachine class) and then determine if you are a winner. Print out results.
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
        
        //No memory leaks here!
        uInput.close();
    }
}