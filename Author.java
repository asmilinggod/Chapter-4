

public class Author
{
    // instance variables - replace the example below with your own
    private String name;
    private int age;

    
    public Author(String nm, int ag)
    {
        // initialise instance variables
        this.name = nm;
        this.age = ag;
    }
    public String toString(){
        return ("The Author's name is " + name + "and is " + age +"years old");
    }
}
