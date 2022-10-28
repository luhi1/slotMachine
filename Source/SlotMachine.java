package main;

public class SlotMachine {

    //Initialize the default value for the slot machine numbers.
    Integer[] slotValues = { 0, 0, 0 };

    //Make it so the player by default loses
    Boolean win = false;

    //Roll the slots, change the value of the slotValues array, and display a nice visual.
    public void roll() {
        for (int i = 0; i < 1000; i++) {
            this.clear();
            for (int j = 0; j < 3; j++){
                slotValues[j] = (int) (Math.random() * 10);
            }
            System.out
                    .println("||| " + slotValues[0] + " |" + "| " + slotValues[1] + " |" + "| " + slotValues[2]
                            + " |||");
        }
    }

    //Determine if the player has winning numbers.
    public boolean checkWin() {
        if (this.slotValues[0] == 7 && this.slotValues[1] == 7 && this.slotValues[2] == 7) {
            this.win = true;
        }
        return this.win;
    }

    //This method was put inside of the slotMachine class because 
    //it is simulating clearing a physical slot machine, not clearing the terminal (eventhough that's what it does).

    public void clear(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
