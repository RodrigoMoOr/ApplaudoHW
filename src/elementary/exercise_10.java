package elementary;

public class exercise_10 {

    public static void main(String [] args) {
        System.out.println("2020 is a leap year, year in which this code was written.");
        computeLeapYears(20,2020);
    }

    private static void computeLeapYears(int amountOfYearsToCalculate, int currentYear) {
        currentYear++;
        int i = 0;

        while (i < amountOfYearsToCalculate) {
            if (currentYear%4 == 0) {
                System.out.println(currentYear + " is a leap year");
                i++;
            }
            currentYear++;
        }
    }
}
