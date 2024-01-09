public class FizzBuzz {

    public static void main(String[] args) {


        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("\n\n\n");

 /*       int j = 1;

        while (j < 101) {

            int c = j % 15;

            switch (c) {
                case 0: {
                    System.out.println("FizzBuzz");
                    break;
                }
                case 5,10: {
                    System.out.println("Buzz");
                    break;
                }
                case 3,6,9,12: {
                    System.out.println("Fizz");
                    break;
                }

                default: {
                    System.out.println(j);
                }

            }
            j++;
        }
*/
    }
}





