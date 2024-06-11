package error_exception;

public class CustomExceptionForVotingSystem {

    private static void votingUser(int age) throws CustomEx {
        if (age < 18) {
           throw new CustomEx("Age must be between 18 and 18 inclusive");
        } else {
            System.out.println("Yes You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        try {
            votingUser(17);

        } catch (CustomEx e) {
            System.out.println(e.getMessage());
        }
    }
}

class CustomEx extends Exception {
    public CustomEx(String message) {
        super(message);
    }
}