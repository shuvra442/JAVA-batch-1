package error_exception;

import error_exception.exception.ExceptionEx;

public class UncheckedException {
    public static void main(String[] args) {

        try {
            int c = 10 / 0;

        } catch (ArithmeticException e){

            System.out.println(e.getMessage());
        }

            String str = null;

        try{
            System.out.println(str.length());
        } catch (NullPointerException nullPointerException) {

            System.out.println(nullPointerException.getMessage());
        }

        }

}
