package collection.list;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        /**
         * 1. duplicate value allow
         * 2.
         */

        List<String> values = new ArrayList<>();

        values.add("12");
        values.add("13");
        values.add("13");

        System.out.println(values);
        System.out.println(values.size());
        System.out.println("After removed "+values.remove(1));
        System.out.println(values);

        ArrayList<String> val = new ArrayList<>();
        val.add("12");
        val.addAll(Arrays.asList("12","13"));


    }
}
