package exercise19;

import java.util.Comparator;

public class ComparatorClass implements Comparator<Dream> {

    @Override
    public int compare(Dream o1, Dream o2) {
        return o1.getDuration()-o2.getDuration();
    }
}
