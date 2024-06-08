package error_exception.exception;

public class ExceptionEx {

    public static void main(String[] args) {

        int []ar = new int[5]; //0 to 4

            System.out.println(ar[1]);

            try {
                System.out.println(ar[5]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Hi " + e.getMessage());
            }
    }
}
