package helloworldconsulting;

class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {

            validateScore(105);

    }

    static void validateScore(int score) throws CustomException {
        if (score > 100) {
            throw new CustomException("Score cannot be more than 100");
        }
        System.out.println("Valid score: " + score);
    }
}