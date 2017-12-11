
/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    // instance variables - replace the example below with your own
    private int x;
    public static void main(String[] args){
        Library ahs = new Library(10, "Acalanes");
        
        
        Author a = new Author( "Jim", 23);
        Author c = new Author ( "JK Rowling", 116);
        Book b = new Book( a, "Java Book");
        Book d = new Book(c, "harry Potter and the goblet of fire");
        ahs.addBook(b, 1);
        
        System.out.println (ahs);
    }
    
    
}
