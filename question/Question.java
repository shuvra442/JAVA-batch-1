package question;

import com.sun.security.jgss.GSSUtil;

public class Question {
    public static void main(String[] args) {
        String num = "Hello, world";
        String target = "l";

//        System.out.println(reversee(num));
//        StringBuffer stringBuffer = new StringBuffer(num).reverse();
//        stringBuffer.reverse();

//        System.out.println(stringBuffer);

//        if(stringBuffer.equals(num)){
//            System.out.println("palindrome");
//        } else {
//            System.out.println("not a palindrome");
//        }

        //3 ...
        numberOfOccurences(num, target);

    }

//    public static String reversee(String num){
//        String rev = "";
//        for(int i=num.length()-1;i>=0;i--){
//            rev = rev + num.charAt(i);
//        }
//        StringBuffer stringBuffer = new StringBuffer();
////        stringBuffer.append(num);
//        stringBuffer.reverse(num);
//        return rev;
//
//
//    }

    public  static void numberOfOccurences(String num, String target) {
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == target.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }


}
