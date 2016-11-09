/*
 * NAME:     Aron Latinjak
 * DATE:     11/09/16
 * FILENAME: BaseballTest.java
 * PURPOSE:  To return the records of teams in the world series and their point totals.
 */

package baseballtest;

public class BaseballTest 
{
    public static void main(String[] args) 
    {
        //Declare teams
        BaseballTeam team1 = new BaseballTeam("Chicago Cubs", 10, 5, 2);
        BaseballTeam team2 = new BaseballTeam("Cleveland Indians", 9, 4, 3);
        
        //Display results
        System.out.println("World Series Final Results (Or something idk)");
        System.out.println("---------------------------------------------");
        System.out.print(team1.getName());
        System.out.println(" " + team1.overallPoints());
        System.out.print(team2.getName());
        System.out.println(" " + team2.overallPoints());    
    }
}