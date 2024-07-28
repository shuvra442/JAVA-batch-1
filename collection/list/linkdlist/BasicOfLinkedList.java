package collection.list.linkdlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class BasicOfLinkedList {
    public static void main(String[] args) {
        System.out.println("Basic of Linked List --> And its all methods");

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList);
        linkedList.remove();
        System.out.println(linkedList);

    }
}
