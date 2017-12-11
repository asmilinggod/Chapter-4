
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    
    public Athlete(int ag,String nm)
    {
        // initialise instance variables
        this.age = ag;
        this.name = nm;
        
    }
    public String toString(){
        return ("name: " +name+ " age: " +age);
   
    }
}
