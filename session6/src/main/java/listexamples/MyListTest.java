package listexamples;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<Integer>();
        listInt.add(1);
        listInt.add(12);
        listInt.add(123);
        listInt.add(123);
        listInt.add(1234);

        System.out.println("ele 1 " + listInt.get(1) );
        System.out.println("ele 2 " + listInt.get(2) );
        System.out.println("ele 4 " + listInt.get(4) );


    }
}
