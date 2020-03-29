package elementary;

public class exercise_08 {

    public static void main(String [] args) {

        int n = 2;
        boolean isPrime = true;

        while (true) {

            for (int i = 2; i <= n/2; i++) {
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(n + " is prime");
            }
            n++;
            isPrime = true;
        }
    }
}
