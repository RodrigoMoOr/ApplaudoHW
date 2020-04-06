package interviewtest;

import java.util.Scanner;

public class Exercise_02 {

    /*
        ints a,b,c
        if 2 are equal result = 10
        if all are equal result = 20
     */

    public static void main(String [] args) {

        int a = 3, b = 3, c = 3;
        System.out.println(computeLotteryTicket(a, b, c)); // should always be 20

        a = 2;
        b = 1;
        c = 2;
        System.out.println(computeLotteryTicket(a, b, c));

        a = 2;
        b = 5;
        c = 1;
        System.out.println(computeLotteryTicket(a, b, c));

    }

    /**
     * Computes result for a lottery ticket based on params:
     * @param a
     * @param b
     * @param c
     * @return result of the ticket: 0, 10 or 20
     */
    private static Integer computeLotteryTicket (int a, int b, int c) {

        int result = 0;
        if (a == b && b == c) {
            result = 20;
            return result;
        } else if (a == b || b == c || a == c) {
            result = 10;
            return result;
        }

        return result;
    }
}
