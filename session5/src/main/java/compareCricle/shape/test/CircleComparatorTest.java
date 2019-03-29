package compareCricle.shape.test;

import compareCricle.shape.cricle.CircleComparator;
import compareCricle.shape.cricle.Cricle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Cricle[] cricles = new Cricle[3];

        cricles[0] = new Cricle(3.6);
        cricles[1] = new Cricle();
        cricles[2] = new Cricle("pink" , true, 5);

        System.out.println(" pre- sorted");
        for (Cricle cricle : cricles){
            System.out.println(cricle);
        }

        CircleComparator cricleComparator = new CircleComparator();
        Arrays.sort(cricles,cricleComparator);

        System.out.println("After sorted: ");
        for (Cricle cricle : cricles){
            System.out.println(cricle);
        }
    }
}
