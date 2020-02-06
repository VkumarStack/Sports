//*************************************************************
//  Football.java
//
//  Represents a game of football, with appropriate scoring
//  methods to increment scores for touchdowns, field goals,
//  distance, and time as well as to switch offense.
//*************************************************************
public class Football extends Sport
{
    private int timeLeft; // in seconds
    private int quarter;
    private double totalDistanceRan; // in yards
    private boolean isOffense; // true indicates that team1 is on the offensive while false indicates that they are on the defensive
    private boolean gameEnd;

    //------------------------------------------------------------------------------
    //  Constructor for the Football class that, in addition to all Sport variables,
    //  sets the initial offensive team and sets the amount of time left to twelve
    //  minutes, the quarter to one, and the total distance ran to zero.
    //------------------------------------------------------------------------------
    public Football(String team1Name, String team2Name, boolean initialOffense)
    {
        super("Football", team1Name, team2Name, new String[4], "Get the football to the other side of the field, either by touchdown or toss.");
        super.equipment[0] = "Football";
        super.equipment[1] = "Uniforms";
        super.equipment[2] = "Helmets";
        super.equipment[3] = "Boots";
        isOffense = initialOffense;
        quarter = 1;
        timeLeft = 900;
        totalDistanceRan = 0;
        gameEnd = false;
    } // end three-argument constructor with call to super

    //------------------------------------------------------------------------------
    //  Scoring methods for each selected team. Touchdowns score six points and
    //  field goals score three.
    //------------------------------------------------------------------------------
    public void touchDownPlayer1()
    {
        super.incrementScore1(6);
    } // end method touchDownPlayer1
    public void touchDownPlayer2()
    {
        super.incrementScore2(6);
    } // end method touchDownPlayer2
    public void fieldGoal1()
    {
        super.incrementScore1(3);
    } // end method fieldGoal1
    public void fieldGoal2()
    {
        super.incrementScore2(3);
    } // end method fieldGoal2

    public String callFoul()
    {
        return "The player has conducted unsportsmanlike behavior by harming others";
    } // end method callFoul

    //------------------------------------------------------------------------------
    //  Decrements the time in the game passed. If time runs out, the quarter
    //  is incremented and the time resets back to twelve minutes.
    //------------------------------------------------------------------------------
    public void decrementTime(int decrement)
    {
        timeLeft -= decrement;
        if (timeLeft <= 0)
        {
            quarter++;
            if (quarter > 4)
            {
                quarter = 4;
                gameEnd = true;
            } // end inner if
            else
            {
                timeLeft = 900;
            } // end else
        } // end if
    } // end method decrementTime

    //------------------------------------------------------------------------------
    //  Increments the distance ran in the game.
    //------------------------------------------------------------------------------
    public void incrementDistance(int distance)
    {
        totalDistanceRan += distance;
    } // end method incrementDistance

    //------------------------------------------------------------------------------
    //  Switches offense between the teams.
    //------------------------------------------------------------------------------
    public void switchOffense()
    {
        if (isOffense == true)
        {
            isOffense = false;
        } // end if
        else
        {
            isOffense = true;
        } // end else
    } // end method switchOffense

    //------------------------------------------------------------------------------
    //  Standard getters
    //------------------------------------------------------------------------------
    public int getTimeLeft()
    {
        return timeLeft;
    } // end getTimeLeft
    public int getQuarter()
    {
        return quarter;
    } // end getQuarter
    public double getTotalDistanceRan()
    {
        return totalDistanceRan;
    } // end getTotalDistanceRan
    public boolean getIsOffense()
    {
        return isOffense;
    } // end getIsOffense
    public boolean getGameEnd()
    {
        return gameEnd;
    } // end getGameEnd

    //------------------------------------------------------------------------------
    //  toString method that displays all attributes of Sport as well as the
    //  instance variables from Football.
    //------------------------------------------------------------------------------
    public String toString()
    {
        String output = super.toString();
        if (isOffense)
        {
            output += super.getTeam1Name() + " is on offense.\n";
        } // end if
        else
        {
            output += super.getTeam2Name() + " is on offense.\n";
        } // end else
        output += "Quarter: " + quarter + "\n";
        output += timeLeft + " seconds left \n";
        output += totalDistanceRan + " yards ran.\n";
        if (gameEnd)
        {
            output += "The game has ended.\n";
        } // end if
        else
        {
            output += "The game is ongoing.\n";
        } // end else
        return output;
    } // end toString
} // end class Football