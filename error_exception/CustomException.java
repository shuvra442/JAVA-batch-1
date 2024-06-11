package error_exception;

public class CustomException {

    private static void vailidInput(int input) throws MyException   {

        if(input < 0){
            throw new MyException("Input must be positive");
        }
    }

    public static void main(String[] args)  {

        try {
            vailidInput(-1);

        } catch (MyException r){
            System.out.println(r.getMessage());
        }
    }
}

class MyException extends Exception{

    public MyException(String message){
        super(message);
    }
}
