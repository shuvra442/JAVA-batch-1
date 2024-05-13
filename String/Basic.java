package String;



public class Basic {
    public static void main(String[] args) {

        String str="abcd"; // String class  implements CharSequence interface and this interface is used to represent sequence of characters.

//        How to represent String in java
        /**
         * 1. string literals
         * 2. string new keyword
         */

//        1.string literals
        String str1="Biswajit";
        str1.concat("Sanjana");
        System.out.println(str1);

        /**
         * In java String is  immutable representation
         *
         */
        String str2="Biswajit";
        String str3 = str2.concat("Sanjana");
        System.out.println(str3);
    }
}
