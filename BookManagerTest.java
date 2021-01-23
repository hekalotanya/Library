package Library;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

class BookManagerTest {
	@Test
    public void BookManagerMethodsTesting() {		
        BookManager manager = new BookManager(); // BookManager is tested
        
        ArrayList<Book> books = new ArrayList<Book>();
        
        // assert statements
        assertEquals("create library should create arary list with 5 books", 5, manager.createLibrary(books).size());
        assertEquals("Library should contain Martin Eden as last book by default", "Martin Eden", books.get(4).getName());
	} 
}