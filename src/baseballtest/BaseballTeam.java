package baseballtest;

public class BaseballTeam extends Sports implements Stats
{
    //More variables
    int winPoints;
    int tiePoints;
    int points;
    String teamName;
    
    /**
     * Constructor
     * pre: None
     * post: Initializes variables
     */
    public BaseballTeam()
    {
        super();
        teamName = "Name";
        winPoints = 0;
        tiePoints = 0;
    }           
    /**
     * Constructor
     * pre: None
     * post: Initializes variables
     */
    public BaseballTeam(String name, int wins, int ties, int losses)
    {
        super();
        teamName = name;
        winPoints = wins * 2;
        tiePoints = ties;
    }
    /**
     * Sets a value for teamName
     * pre: String is given
     * post: teamName is given a value
     * @param a 
     */
    public void setName(String a)
    {
        teamName = a;
    }
    /**
     * Returns teamName
     * pre: None
     * post: teamName is returned
     * @return 
     */
    public String getName()
    {
        return(teamName);
    }
    @Override
    /**
     * Calculates total number of points
     * pre: None
     * post: points is returned
     * @return
     */
    public int overallPoints()
    {
        points = winPoints + tiePoints;
        return(points);
    }
}