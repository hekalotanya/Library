package Library;

public class IncorrectYearException extends Exception {
	public IncorrectYearException() {
		super("Year should be positive integer and not bigger than current year!");
	}
}
