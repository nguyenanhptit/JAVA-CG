package arraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(1, 1);

        System.out.println("Mang co do dai la " + arrayList.size());
        System.out.println(arrayList);


        System.out.println("Mang copy la : " + arrayList.clone());
        System.out.println("Nhap vao gia tri can tim: ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println("Gia tri " + num + " co torng mang hay khong : " + arrayList.contains(num));

        System.out.println("vi tri cua " + num + " la: " + arrayList.indexOf(num));

        System.out.println("nhap vao vi tri can tim : ");
        int index = scanner.nextInt();
        System.out.println("Gia tri tai vi tri " + index + " la: " + arrayList.get(index));


        arrayList.clear();
        System.out.println("mang da xoa" + arrayList);
    }
}
