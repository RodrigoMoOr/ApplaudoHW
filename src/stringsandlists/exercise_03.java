package stringsandlists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise_03 {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");

        System.out.println("Enter a month of the year to search in the list of months");
        String keyword = scanner.nextLine();

        Boolean result = searchList(list, keyword);

        System.out.println(result);
    }

    private static Boolean searchList (List<String> list, String keyword) {

        Boolean result = false;

        if (list.contains(keyword)) {
            result = true;
        }

        return result;
    }
}
