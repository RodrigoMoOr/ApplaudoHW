package stringsandlists;

import java.util.Collections;
import java.util.List;

public class exercise_01 {

    Integer computeLargestElement(List<Integer> list) {

        if (list != null && !list.isEmpty()) {
            return Collections.max(list);
        }

        return null;
    }
}
