import java.awt.*;
import java.util.Random;
import java.util.Scanner;


public class Dice {

    final int[] diceFaces = {1, 2, 3, 4, 5, 6};
    Color diceColor;

    public Dice(Color inputDiceColor) {
        this.diceColor = inputDiceColor;
    }

    public void rollDice() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to roll the dice? (y or n)");

        if (sc.hasNext("y")) {
            Random rand = new Random();
            for (int i = 0; i < 2; i++) {
                int randomNumber = rand.nextInt(this.diceFaces.length);
                System.out.println("You rolled: " + diceFaces[randomNumber]);
            }
            rollDice();
        } else if (sc.hasNext("n")) {
            System.out.println("Goodbye. Thanks for playing.");
        } else {
            System.out.println("Invalid input");
            rollDice();
        }

    }



}
