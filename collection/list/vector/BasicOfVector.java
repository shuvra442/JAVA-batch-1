package collection.list.vector;

import java.util.Vector;

public class BasicOfVector {
    public static void main(String[] args) {
        Vector<Integer> vector =  new Vector<>();  // same as arrayList

        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println(vector);

        vector.addFirst(0);
        vector.addLast(4);

        System.out.println(vector);

        System.out.println(vector.capacity());

        System.out.println(vector.hashCode());




    }
}
