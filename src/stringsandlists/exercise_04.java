package stringsandlists;

import java.util.ArrayList;
import java.util.List;

public class exercise_04 {

    public static void main(String [] args) {

        List<String> list = new ArrayList();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");

        System.out.println(oddPositions(list));
    }

    private static List<String> oddPositions(List<String> list) {
        List odds = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            if ((i+1)%2 != 0) {
                odds.add(list.get(i));
            }
        }

        return odds;
    }
}
