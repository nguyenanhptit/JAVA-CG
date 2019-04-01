package compareCricle.shape.cricle;

import java.util.Comparator;

//public class CircleComparator implements Comparator<Cricle> {
//
//    @Override
//    public int compare(Cricle c1, Cricle c2) {
//        if (c1.getRad() > c2.getRad()) {
//            return 1;
//        } else if (c1.getRad() < c2.getRad()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
//}

public class CircleComparator extends Cricle implements Comparable<CircleComparator> {

    public CircleComparator() {
    }

    public CircleComparator(double rad) {
        super(rad);
    }

    public CircleComparator(String color, boolean filled, double rad) {
        super(color, filled, rad);
    }


    @Override
    public int compareTo(CircleComparator c) {
        if (getRad() > c.getRad()) {
            return 1;
        } else if (getRad() < c.getRad()) {
            return -1;
        } else {
            return 0;
        }
    }
}
