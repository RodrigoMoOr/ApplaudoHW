package elementary;

import java.util.Scanner;

public class exercise_04 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();

        System.out.println(sum(n));
    }

    static int sum(int n) {
        int i = 1;
        int result = 0;

        while (i <= n) {
            result += i;
            i++;
        }

        return result;
    }
}
