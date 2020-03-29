package elementary;

public class exercise_07 {

    public static void main(String [] args) {

        for (int i = 1; i <= 12; i++) {
            System.out.println("\nTable of " + i + "\n");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
    }
}
