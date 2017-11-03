
/**
 * Write a description of class Factory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factory
{
    // instance variables - replace the example below with your own
    private double sqFootage;
    private Car[] inventory;

    /**
     * Constructor for objects of class Factory
     */
    public Factory(double sqF, int number)
    {
        this.sqFootage = sqF;
        this.inventory = new Car[number];
    }
    public void setCar(Car c, int index){
        inventory[index] = c;
    }
    public String toString() {
        String output = "This factory has \n";
        for(Car c : inventory){
            output += c + "\n";
        }
        
        return output;
    }
    
}
