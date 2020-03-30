package stringsandlists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class exercise_02 {

    public static void main(String [] args) {
        ArrayList<String> array = new ArrayList<String>();
        array.add("item 1");
        array.add("item 2");
        array.add("item 3");
        array.add("item 4");
        array.add("item 5");

        System.out.println(reverseList(array));
    }

    private static<T> List<T> reverseList(List<T> list) {
        List<T> reverse = new ArrayList<>(list);
        Collections.reverse(reverse);

        return reverse;
    }
}
