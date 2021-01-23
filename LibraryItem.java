package Library;

public abstract class LibraryItem {
	private String name;
    private static int count = 0;
    public int id;
    
    public LibraryItem(String name) {
        this();
        this.name = name;
    }
    
    public LibraryItem() {
        count++;
        id = count;
    }
    
   
    public static int getItemsCount() {
    	return count;
    }	
    
 // rename existing book
 	public void setName(String name) {
 		this.name = name;
 	}
 	
 	// get Books name
 	public String getName() {
 		
 		return this.name;
 	}
}
