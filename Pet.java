
/**
 * Write a description of class Pet here.
 *instance variables, constructor, getter
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    public static int numPets;

    public Pet(int ag, String nm, boolean al){
        this.age = ag;
        this.name = nm;
        numPets++;
    }
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
  
    public String toString(){
       return "this pet is named " + name + "and is " + age +" years old";
    }
  
    public static void example() {
        System.out.println("This is static!");
    }
    
}
