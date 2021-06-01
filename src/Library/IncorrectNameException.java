package src.Library;

public class IncorrectNameException extends Exception {
    public IncorrectNameException() {
        super("Books name should contain at least 3 symbols!");
    }
}
