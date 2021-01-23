package Library;

public abstract class LibraryItem {
	private String name;
    private static int count = 0;
    public int id;
    
    public LibraryItem(String name) {
        this.name = name;
        count++;
        id = count;
    }
    
   
    public static int getItemsCount() {
    	return count;
    }	
    
 // rename existing book
 	public String setName(String name) {
 		this.name = name;
 		
 		return name;
 	}
 	
 	// get Books name
 	public String getName() {
 		
 		return this.name;
 	}
}
