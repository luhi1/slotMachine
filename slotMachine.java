package main;

public class slotMachine {
    /*
     * array for information to be stored in the slot machine
     * ability to roll
     */

    Integer[] slotValues = { 0, 0, 0 };

    public slotMachine() {
    }

    public void roll() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            slotValues[0] = (int) (Math.random() * 100);
            slotValues[1] = (int) (Math.random() * 100);
            slotValues[2] = (int) (Math.random() * 100);
            System.out
                    .println("||| " + slotValues[0] + " |" + "| " + slotValues[1] + " |" + "| " + slotValues[2]
                            + " |||");
        }
    }

    public boolean win() {
        if (this.slotValues[0] == 7 && this.slotValues[1] == 7 && this.slotValues[2] == 7) {
            return true;
        } else {
            return false;
        }
    }
}
