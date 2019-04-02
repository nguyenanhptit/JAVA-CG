package linkedlistmethod;

import java.util.LinkedList;
import java.util.Scanner;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.add("An");
        linkedList.add("Link");
        linkedList.add("Page");

        linkedList.add(1, "bi");
        linkedList.add(3, "ui");

        System.out.println(linkedList);

        linkedList.addFirst("first");
        linkedList.addLast("last");

        System.out.println(linkedList);

        linkedList.remove(0);
        linkedList.remove("ui");
        System.out.println(linkedList);

        System.out.println(linkedList.clone());

        System.out.println("nhap vao gia tri muon kiem tra: ");
        Scanner scanner = new Scanner(System.in);

        String insert = scanner.nextLine();
        System.out.println("gia tri " + insert + " co trong mang hay khong : " + linkedList.contains(insert));

        System.out.println("vi tri cua " + insert + " la: " + linkedList.indexOf(insert));

        System.out.println("Phan tu dau va cuoi la : " + linkedList.getFirst() + ", " + linkedList
                .getLast());

        System.out.println("Nhap vao vi tri can tim: ");
        int index = scanner.nextInt();
        System.out.println("gia tri tai vi tri " + index + " la : " + linkedList.get(index));
        linkedList.clear();
        System.out.println("Xoa list" + linkedList);
    }
}
