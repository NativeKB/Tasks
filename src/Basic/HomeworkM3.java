package Basic;

import java.time.LocalDate;
import java.util.Scanner;

public class HomeworkM3 {

    public static void main(String[] args) {

        int year = getYear();
        Scanner input = getInput();

        System.out.println("It is year " + year + "\n" + "What is Father's year of birth?");    // father if else
        int father = input.nextInt();
        if (year - father > 64) {
            System.out.println("He could be a retiree");
        } else {
            System.out.println("He could be still work");
        }

        System.out.println("What is Mother's year of birth?");                                  // mother while
        int mother = input.nextInt();
        while (year - mother > 59) {
            System.out.println("She could be a retiree");
            break;
        }
        // for
        while (year - mother < 60) {
            System.out.println("She could still work");
            break;
        }


        System.out.println("What is first kid's year of birth?");                           // 1st kid if else
        int kid1 = input.nextInt();
        if (year - kid1 < 18) {
            System.out.println("He/she is under age");
        } else {
            System.out.println("He/she is an adult");
        }


        System.out.println("What is second kid's year of birth?");                              // 2nd kid switch
        int kid2 = input.nextInt();
        switch (year - kid2) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17: {
                System.out.println("He/she is under age");
                break;
            }
            default: {
                System.out.println("He/she is an adult");
            }

        }
        int a = year - father;
        int b = year - mother;
        int c = year - kid1;
        int d = year - kid2;
        int sum = getSum(a, b, c, d);                                 // sum
        double avg = avg(a, b, c, d);
        System.out.println("Father is " + (a) + " years old\n" + "Mother is " + (b) + " years old\n"
                + "First kid is " + (c) + " years old\n" + "Second kid is " + (d) + " years old\n" + "Family's overall age is " + sum + "\nTheir average age is " + avg);


    }


    static double avg(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    static int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static Scanner getInput() {
        return new Scanner(System.in);
    }

    static int getYear() {
        return LocalDate.now().getYear();
    }
}
