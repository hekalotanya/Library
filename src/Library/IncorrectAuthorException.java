package src.Library;

public class IncorrectAuthorException extends Exception {
    public IncorrectAuthorException() {
        super("Books Authors name is too short!");
    }
}
