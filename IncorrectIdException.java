package Library;

public class IncorrectIdException extends Exception {
	public IncorrectIdException() {
		super("Provided Id is incorrect!");
	}
}
