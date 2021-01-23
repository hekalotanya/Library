package Library;

public class Book extends LibraryItem {
    private String author;
    private int publishingYear;

    public Book(String name, String author, int publishingYear) {
    	super(name);
        this.author = author;
        this.publishingYear = publishingYear;
    }

   
	
	// set books author
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// get books author
	public String getAuthor() {
		return this.author;
	}
	
	// set books publishing year
	public void setYear(int year) {
		this.publishingYear = year;
	}
		
	// get books publishing year
	public int getYear() {
		return this.publishingYear;
	}
	
}