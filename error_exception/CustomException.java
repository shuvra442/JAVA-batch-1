package error_exception;

public class CustomException {


    public static void main(String[] args)  {
        try{
            throw new MyException("It's not possible to divide any number by 0");

        } catch (MyException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("xjbv");
        }
    }
}

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }
}
