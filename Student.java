
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    private String name;
    private int idNumber;
    
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        
    }
    public Student(int num, String nm){
        this.idNumber=num;
        this.name = nm;
    }
    public int getID(){
        return this.idNumber;
    }
    public String toString() {
        return ("the students name is " + this.name);
    }
    public Student newStudent(Student other){
        Student temp = new Student(other.idNumber, this.name);
        return temp;
    }
}
