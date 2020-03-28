package elementary;

import java.util.Scanner;

public class exercise_03 {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String username = scanner.nextLine();

        if (username.trim().equalsIgnoreCase("bob") || username.trim().equalsIgnoreCase("alice")) {
            System.out.println("Welcome " + username);
        }
    }
}
