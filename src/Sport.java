//*************************************************************
//  Sport.java
//
//  Represents a general sport, with bare minimum attributes of
//  team names, scores, equipment, and rules.
//*************************************************************
public abstract class Sport
{
    protected String sportName;
    protected String team1Name;
    protected String team2Name;
    protected int score1;
    protected int score2;
    protected String[] equipment;
    protected String rules; // General overview of the rules

    //------------------------------------------------------------------------------
    //  Constructor for the Sport class taking in the name of the sport, team names,
    //  equipment used, and sport rules. It also sets all scores to zero.
    //------------------------------------------------------------------------------
    public Sport(String sportName, String team1Name, String team2Name, String[] equipment, String rules)
    {
        this.sportName = sportName;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.equipment = equipment;
        this.rules = rules;
        score1 = 0;
        score2 = 0;
    } // end five-argument constructor

    //------------------------------------------------------------------------------
    //  Abstract method meant to indicate how exactly a foul occurs in the given
    //  sport.
    //------------------------------------------------------------------------------
    public abstract String callFoul();

    //------------------------------------------------------------------------------
    //  Increments the score by a given amount for the selected team.
    //------------------------------------------------------------------------------
    public void incrementScore1(int increment)
    {
        score1 += increment;
    } // end method incrementScore1
    public void incrementScore2(int increment)
    {
        score2 += increment;
    } // end method incrementScore2

    //------------------------------------------------------------------------------
    //  Standard getters for each instance variable.
    //------------------------------------------------------------------------------
    public String getSportName()
    {
        return sportName;
    } // end method getSportName
    public String getTeam1Name()
    {
        return team1Name;
    } // end method getTeam1Name
    public String getTeam2Name()
    {
        return team2Name;
    } // end method getTeam2Name
    public String[] getEquipment()
    {
        return equipment;
    } // end method getEquipment
    public String getRules()
    {
        return rules;
    } // end method getRules
    public int getScore1()
    {
        return score1;
    } // end method getScore1
    public int getScore2()
    {
        return score2;
    } // end method getScore2

    //------------------------------------------------------------------------------
    //  toString method that displays all instance variables.
    //------------------------------------------------------------------------------
    public String toString()
    {
        String output = "";
        output += sportName + "\n";
        output += "Rules: " + rules +"\n";
        output += "Equipment: ";
        for (int i = 0; i < equipment.length; i++)
        {
            output += equipment[i] + "  ";
        } // end for
        output += "\n";
        output += team1Name + " vs. " + team2Name + "\n";
        output += "Score: " + score1 + " - " + score2 + "\n";
        return output;
    } // end toString
} // end class Sport