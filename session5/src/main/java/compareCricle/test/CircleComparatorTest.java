package compareCricle.test;

import compareCricle.shape.cricle.CircleComparator;
import compareCricle.shape.cricle.Cricle;

import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args) {
//        Cricle[] cricles = new Cricle[3];
            CircleComparator[] cricles = new CircleComparator[3];
//        cricles[0] = new Cricle(3.6);
//        cricles[1] = new Cricle();
//        cricles[2] = new Cricle("pink" , true, 5);

        cricles[0] = new CircleComparator(3.6);
        cricles[1] = new CircleComparator();
        cricles[2] = new CircleComparator("pink" , true, 5);

        System.out.println(" pre- sorted");
        for (Cricle cricle : cricles){
            System.out.println(cricle);
        }

//        CircleComparator cricleComparator = new CircleComparator();
//        Arrays.sort(cricles,cricleComparator);

        Arrays.sort(cricles);
        System.out.println("After sorted: ");
        for (Cricle cricle : cricles){
            System.out.println(cricle);
        }
    }
}
