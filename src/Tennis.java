//*************************************************************
//  Tennis.java
//
//  Represents a game of tennis, with appropriate scoring
//  methods that takes into account going into deuce, breaking
//  a tie, and switching serves after each set won.
//*************************************************************
public class Tennis extends Sport
{
    private int setScore1;
    private int setScore2;
    private boolean isDeuce;
    private boolean isDoubles;
    private boolean team1Serve;
    private boolean gameEnd;

    //------------------------------------------------------------------------------
    //  Constructor for the Tennis class that, in addition to all Sport variables,
    //  determines which player/team serves as well as whether or not the game is
    //  in doubles. It also sets all scores to zero.
    //------------------------------------------------------------------------------
    public Tennis(String team1Name, String team2Name, boolean isTeam1Serve, boolean isDoubles)
    {
        super("Tennis", team1Name, team2Name, new String[1], "Hit the tennis ball using your racket to the other team's court. The ball can only bounce once on your own court and must be in the correct box when hit.");
        super.equipment[0] = "Racket";
        team1Serve = isTeam1Serve;
        this.isDoubles = isDoubles;
        setScore1 = 0;
        setScore2 = 0;
        isDeuce = false;
        gameEnd = false;
    } // end four-argument constructor with call to super

    //------------------------------------------------------------------------------
    //  Scoring method for the selected team. It ensures that the game is scored
    //  appropriately for tennis (0 -> 15 -> 30 -> 40) and takes into account
    //  the possibility of deuce occurring. It increments the set score (taking to
    //  account serve order) and also determines whether or not the overall game has
    //  been won according to the set score.
    //------------------------------------------------------------------------------
    public void scoreTeam1()
    {
        if (setScore1 == 40 && setScore2 == 40)
        {
            isDeuce = true;
        } // end if
        if (isDeuce)
        {
            setScore1 += 1;
            if (Math.abs(setScore1 - setScore2) == 2)
            {
                super.incrementScore1(1);
                setScore1 = 0;
                setScore2 = 0;
                isDeuce = false;
                if ((super.getScore1() == 6 && super.getScore2() <= 4) || ((super.getScore1() > 4 && super.getScore2() > 4) && Math.abs(super.getScore1() - super.getScore2()) == 2))
                {
                    gameEnd = true;
                } // end inner-inner if
                else
                {
                    if (team1Serve)
                    {
                        team1Serve = false;
                    } // end inner-inner-inner if
                    else
                    {
                        team1Serve = true;
                    } // end inner-inner-inner else
                } // end inner-inner else
            } // end inner if
        } // end if
        else if (setScore1 == 0 || setScore1 == 15)
        {
            setScore1 += 15;
        } // end else if
        else if (setScore1 == 30)
        {
            setScore1 += 10;
        } // end else if
        else if (setScore1 == 40)
        {
            if (setScore2 == 40)
            {
                isDeuce = true;
            } // end inner if
            else
            {
                super.incrementScore1(1);
                setScore1 = 0;
                setScore2 = 0;
                if ((super.getScore1() == 6 && super.getScore2() <= 4) || ((super.getScore1() > 4 && super.getScore2() > 4) && Math.abs(super.getScore1() - super.getScore2()) == 2))
                {
                    gameEnd = true;
                } // end inner if
                else
                {
                    if (team1Serve)
                    {
                        team1Serve = false;
                    } // end inner if
                    else
                    {
                        team1Serve = true;
                    } // end inner-inner else
                } // end inner-else
            } // end else
        } // end else if
    } // end scoreTeam1
    public void scoreTeam2()
    {
        if (setScore1 == 40 && setScore2 == 40)
        {
            isDeuce = true;
        } // end if
        if (isDeuce)
        {
            setScore2 += 1;
            if (Math.abs(setScore2 - setScore1) == 2)
            {
                super.incrementScore2(1);
                setScore1 = 0;
                setScore2 = 0;
                isDeuce = false;
                if ((super.getScore2() == 6 && super.getScore1() <= 4) || ((super.getScore2() > 4 && super.getScore1() > 4) && Math.abs(super.getScore2() - super.getScore1()) == 2))
                {
                    gameEnd = true;
                } // end inner-inner if
                else
                {
                    if (team1Serve)
                    {
                        team1Serve = false;
                    } // end inner-inner-inner if
                    else
                    {
                        team1Serve = true;
                    } // end inner-inner-inner else
                } // end inner-inner else
            } // end inner if
        } // end if
        else if (setScore2 == 0 || setScore2 == 15)
        {
            setScore2 += 15;
        } // end else if
        else if (setScore2 == 30)
        {
            setScore2 += 10;
        } // end else if
        else if (setScore2 == 40)
        {
            if (setScore1 == 40)
            {
                isDeuce = true;
            } // end inner if
            else
            {
                super.incrementScore2(1);
                setScore1 = 0;
                setScore2 = 0;
                if ((super.getScore2() == 6 && super.getScore1() <= 4) || ((super.getScore2() > 4 && super.getScore1() > 4) && Math.abs(super.getScore2() - super.getScore1()) == 2))
                {
                    gameEnd = true;
                } // end inner if
                else
                {
                    if (team1Serve)
                    {
                        team1Serve = false;
                    } // end inner if
                    else
                    {
                        team1Serve = true;
                    } // end inner-inner else
                } // end inner-else
            } // end else
        } // end else if
    } // end scoreTeam2

    //------------------------------------------------------------------------------
    //  Indicates how a foul may occur in tennis, which is when the ball is hit out
    //  in the wrong box.
    //------------------------------------------------------------------------------
    public String callFoul()
    {
        return "The player has committed a foul by hitting the ball out of the box.";
    } // end method callFoul

    //------------------------------------------------------------------------------
    //  Standard getters
    //------------------------------------------------------------------------------
    public int getSetScore1()
    {
        return setScore1;
    } // end getSetScore1
    public int getSetScore2()
    {
        return setScore2;
    } // end getSetScore2
    public boolean getIsDeuce()
    {
        return isDeuce;
    } // end getIsDeuce
    public boolean getIsDoubles()
    {
        return isDoubles;
    } // end getIsDoubles
    public boolean getTeam1Serve()
    {
        return team1Serve;
    } // end getTeam1Serve
    public boolean getGameEnd()
    {
        return gameEnd;
    } // end getGameEnd

    //------------------------------------------------------------------------------
    //  toString method that displays all attributes of Sport as well as the
    //  instance variables from Tennis.
    //------------------------------------------------------------------------------
    public String toString()
    {
        String output = "";
        if (isDoubles)
        {
            output = "Doubles " + super.toString();
        } // end if
        else
        {
            output = "Singles " + super.toString();
        } // end else
        if (!isDeuce)
        {
            output += "Set Score: " + setScore1 + " - " + setScore2 + "\n";
        } // end if
        else
        {
            output += "Set Score: Deuce" + "\n";
        } // end else
        if (team1Serve)
        {
            output += "Serve: " + team1Name + "\n";
        } // end if
        else
        {
            output += "Serve: " + team2Name + "\n";
        } // end else
        if (gameEnd)
        {
            output += "Game Ended\n";
        } // end if
        else
        {
            output += "Game Ongoing\n";
        } // end else
        return output;
    } // end toString
} // end class Tennis