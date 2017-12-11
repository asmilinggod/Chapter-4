
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int x;
    private Author myAuthor;
    private String title;

    /**
     * Constructor for objects of class Book
     */
    public Book(Author a, String tl)
    {
        // initialise instance variables
        this.myAuthor = a;
        this.title = tl;
    }
    
    
    public String toString(){
        return (title + "by" + myAuthor);
    }
}
s