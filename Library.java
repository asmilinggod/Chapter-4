
/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    // instance variables - replace the example below with your own
    private String name;
    private Book[] collection;
    
    /**
     * Constructor for objects of class Library
     */
    public Library(int size, String nm)
    {
        // initialise instance variables
        this.collection = new Book[size];
        this.name = nm;
    }
    public String toString(){
        String output = "the library has: \n";
        for(Book b: collection) {
            output += b+ "\n";
        }
        return output;
    }
    public void addBook(Book b, int i){
        collection[i] = b;
    }
    
}
