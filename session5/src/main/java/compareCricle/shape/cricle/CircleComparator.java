package compareCricle.shape.cricle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Cricle> {

    @Override
    public int compare(Cricle c1, Cricle c2) {
        if (c1.getRad() > c2.getRad()) {
            return 1;
        } else if (c1.getRad() < c2.getRad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
