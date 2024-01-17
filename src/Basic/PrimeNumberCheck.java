package Basic;

// checks if given number is prime

import java.util.Arrays;

public class PrimeNumberCheck {
/*
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
generates prime numbers
*/


    public static void main(String[] args) {
        int n = 1_000_000;

/*
        for (int i = 0; i <= n; i++)
        {
            boolean prime = isPrime(i);
            if (prime) {
                System.out.print(i + " ");
            }
        }
*/
        sieveOfEratosthenes(n);
    }

//    public static boolean isPrime(int n) {
//        if (n <= 1) {
//            return false;
//        }
//        for (int j = 2; j <= Math.sqrt(n); j++)
//            if (n % j == 0) {
//                return false;
//            }
//        return true;
//    }
    public static void sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for (int j = i * i; j <= n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++){
            if (isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }
}