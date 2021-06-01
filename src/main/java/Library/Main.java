package Library;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        //Массив для целых books
        ArrayList<Book> books = new ArrayList<Book>();
        Menu menu = new Menu();
        bookManager.createLibrary(books);
        do {
            bookManager.selectAct(books, menu);
        } while (true);
    }
}
