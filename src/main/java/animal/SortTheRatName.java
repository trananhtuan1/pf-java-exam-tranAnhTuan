package animal;

import java.util.Comparator;

public class SortTheRatName implements Comparator<Rat> {
    @Override
    public int compare(Rat o1, Rat o2) {
        String rat1 = o1.getName();
        String rat2 = o2.getName();
        if (rat1.charAt(0) > rat2.charAt(0)) {
            return 1;
        } else if (rat1 == rat2) {
            return 0;
        } else {
            return -1;
        }
    }
}
