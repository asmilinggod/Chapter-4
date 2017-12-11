
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String teamName;
    private Athlete[] players;

    /**
     * Constructor for objects of class Team
     */
    public Team(String tNm, int size)
    {
        // initialise instance variables
        this.teamName = tNm;
        this.players = new Athlete[size];
    }
    public String toString(){
        String output = ("The team members for "+ this.teamName+ "\n") ;
        
        for(Athlete a : players) {
            output += a + "\n";
        }
        return output;
    }
    public void addAthlete( Athlete a, int index){
        players[index] = a;
    }
    }   

    

