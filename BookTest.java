package Library;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

class BookTest {
	@Test
    public void bookMethodsTesting() {
        Book tester = new Book(null, null, 0); // Book is tested

        // assert statements
        assertEquals("New books name should be 'New Name'", "New Name", tester.setName("New Name"));
        assertEquals("New author name should be 'New Author'", "New Author", tester.setAuthor("New Author"));
        assertEquals("New book year must be 2020", 2020, tester.setYear(2020));
    }
}