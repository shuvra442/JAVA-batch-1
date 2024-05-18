package String;

public class Advanced {

    public static void main(String[] args) {
        /**
         * 1. StringBuffer
         * 2. StringBuilder  both of are mutable nature.
         */

//        String str = "hello";
//        str = "Byee";
//        System.out.println(str);

//        1. StringBuffer
        StringBuffer sb = new StringBuffer("mahadev");
        sb.append("kanika");
        System.out.println(sb);

        sb.reverse();
        System.out.println("In reversed order :: "+sb);

//        2. StringBuilder
        StringBuilder sb1 = new StringBuilder("mahadev");
        sb1.append("kanika");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println("In reversed order :: "+sb1);

    }
}
