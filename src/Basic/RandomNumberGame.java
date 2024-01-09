package Basic;

import java.util.Random;
import java.util.Scanner;


public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner input = getInput();
        int oneForPlayAgain = 1;


        while (oneForPlayAgain == 1) {
            int number = new Random().nextInt(1, 101);
            int count = 0;
            System.out.println("RANDOM NUMBER GAME\n====================\nGuess number from 1 to 100");

            for (int answer = -1; answer != number; count++) {
                answer = input.nextInt();
                if (answer != number) {
                    if (answer < number) {
                        System.out.println("Wrong. Number is greater. Try again:");
                    } else {
                        System.out.println("Wrong. Number is smaller. Try again:");
                    }
                    System.out.println(number);
                } else {
                    System.out.println("You won! Correct number is " + number);
                }
            }

            if (count == 1) {
                System.out.println("You tried " + count + " time");
            } else {
                System.out.println("You tried " + count + " times");
            }

            System.out.println("Wanna play again?! Enter 1 for yes / enter other key for no)");
            oneForPlayAgain = input.nextInt();
        }
    }

    private static Scanner getInput() {
        return new Scanner(System.in);
    }
}
