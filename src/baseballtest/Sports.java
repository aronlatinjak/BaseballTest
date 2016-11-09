package baseballtest;

public class Sports 
{
    //Initialize variables
    int wins, losses, ties;
    int points;
    
    /**
     * Constructor
     * pre: None
     * post: Initializes variables
     */
    public Sports()
    {
        wins = 0;
        losses = 0;
        ties = 0;
    }
    /**
     * Constructor
     * pre: None
     * post: Initializes variables
     */
    public Sports (String name)
    {   
        wins = 0;
        losses = 0;
        ties = 0;
    }
    /**
     * Sets a value for wins
     * pre: int is given
     * post: wins is given a value
     * @param x 
     */
    public void setWins(int x)
    {
        wins = x;
    }
    /**
     * Sets a value for losses
     * pre: int is given
     * post: losses is given a value
     * @param y 
     */
    public void setLosses(int y)
    {
        losses = y;
    }
    /**
     * Sets a value for ties
     * pre: int is given
     * post: ties is given a value
     * @param z
     */
    public void setTies(int z)
    {
        ties = z;
    }            
}