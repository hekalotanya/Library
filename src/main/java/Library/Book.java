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
    public String setAuthor(String author) {
        this.author = author;

        return this.author;
    }

    // get books author
    public String getAuthor() {
        return this.author;
    }

    // set books publishing year
    public int setYear(int year) {
        this.publishingYear = year;

        return publishingYear;
    }

    // get books publishing year
    public int getYear() {
        return this.publishingYear;
    }

}
