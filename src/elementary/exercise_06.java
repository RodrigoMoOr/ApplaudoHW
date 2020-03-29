package elementary;

import java.util.Scanner;

public class exercise_06 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        System.out.println("Select and option:\n\n1. Add all numbers from 1 to n\n2. Product of all numbers from 1 to n.");
        int selection = scanner.nextInt();

        switch (selection) {
            case 1:
                System.out.println(sum(n));
                break;

            case 2:
                System.out.println(product(n));
                break;
        }
    }

    private static int sum(int n) {
        int i = 1;
        int result = 0;

        while (i <= n) {
            result += i;
            i++;
        }

        return result;
    }

    private static int product(int n) {
        int i = 1;
        int result = 1;

        while (i <=n) {
            result = result*(i);
            i++;
        }

        return result;
    }
}
