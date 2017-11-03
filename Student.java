
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Student
{
    private String name;
    private int idNumber;
    scan.score1 = next int;
    scan.score2 = next int;
    Scanner scan = new Scanner(System.in);
    public Student(int num, String nm){
        this.idNumber=num;
        this.name = nm;
        
    }
    public int getID(){
        return this.idNumber;
    }
    public String getName(){
        return this.name;
    }
    public String toString() {
        return ("the students name is " + this.name);
    }
    
}
