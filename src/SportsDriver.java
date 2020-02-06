//*************************************************************
//  SportsDriver.java
//
//  Driver class for the Tennis and Football classes in order
//  to demonstrate functionality.
//*************************************************************
public class SportsDriver
{
    public static void main(String[] args)
    {
        Football football = new Football("Patriots", "Eagles", true);
        System.out.println(football);
        football.touchDownPlayer1();
        football.touchDownPlayer2();
        football.incrementDistance(500);
        football.decrementTime(800);
        System.out.println(football);
        football.fieldGoal1();
        football.fieldGoal2();
        football.decrementTime(100);
        football.switchOffense();
        System.out.println(football);
        System.out.println(football.callFoul());
        System.out.println();
        football.decrementTime(900);
        football.decrementTime(900);
        football.decrementTime(900);
        System.out.println(football);

        Tennis tennis = new Tennis("Serena Williams", "Venus Williams", true, false);
        System.out.println(tennis);
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        System.out.println(tennis);
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam2();
        tennis.scoreTeam2();
        tennis.scoreTeam2();
        System.out.println(tennis);
        tennis.scoreTeam1();
        tennis.scoreTeam2();
        tennis.scoreTeam2();
        tennis.scoreTeam2();
        System.out.println(tennis);
        for (int i = 0; i < 4; i++)
        {
            for (int z = 0; z < 4; z++)
            {
                tennis.scoreTeam1();
            } // end inner for
        } // end for
        for (int i = 0; i < 4; i++)
        {
            for (int z = 0; z < 4; z++)
            {
                tennis.scoreTeam2();
            } // end inner for
        } // end for
        System.out.println(tennis);
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        tennis.scoreTeam1();
        System.out.println(tennis);
    } // end method main
} // end class SportsDriver