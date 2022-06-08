package GuessNumber;

import java.util.Random;

public class guessNumber {

    private int number;


    public guessNumber() {
        Random random = new Random();
        this.number = random.nextInt(0, 10);
    }

    public void guessNumber() {
        Random random = new Random();
        int guess;
        boolean correctGuess = false;
        while (!correctGuess) {
            guess = random.nextInt(0, 10);
            if (number == guess) {
                correctGuess = true;
                System.out.println("Korrekt gæt");
            } else if (guess > number) {
                System.out.println("Nummeret er højere");
            } else System.out.println("Nummeret er lavere");
        }
    }


    public static void main(String[] args) {
        guessNumber number = new guessNumber();
        number.guessNumber();
    }
}
