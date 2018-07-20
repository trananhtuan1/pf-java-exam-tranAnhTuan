package animal;

import java.util.Comparator;

public class SortTheCatName implements Comparator<Cat> {


    @Override
    public int compare(Cat o1, Cat o2) {
        String cat1 = o1.getName();
        String cat2 = o2.getName();
        if (cat1.charAt(0) > cat2.charAt(0)) {
            return 1;
        } else if (cat1 == cat2) {
            return 0;
        } else {
            return -1;
        }
    }
}
