package Basic;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = getInput();
        int count = 0;

        System.out.println("=======================================\n\nEnter a number and check if it's prime number:");
        int number = input.nextInt();
        for (int i = 1; (i <= number) && (count < 3); i++) {
            if ((number % i) == 0) {
                count++;
            }
        }

        if (count < 2) {
            System.out.println("It is neither a prime nor a composite number");
        } else if (count > 2) {
            System.out.println("It's a composite number");
        } else {
            System.out.println("It's a prime number");
        }

    }


    private static Scanner getInput() {
        return new Scanner(System.in);
    }

}
