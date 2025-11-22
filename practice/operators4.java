public class operators4
{
    public static void main(String[] args) 
    {
        
        int points = 5;
        int bonus = 10;
        int lives = 3;
        
        int result1 = points++;
        int result2 = ++bonus;
        int result3 = --lives;
        int result4 = lives--;
        
        boolean check1 = (result1 == 5);
        boolean check2 = (result2 == 11);
        boolean check3 = (result3 == 2);
        boolean check4 = (result4 == 2);
        
        boolean check5 = (points == 6);
        boolean check6 = (bonus == 11);
        boolean check7 = (lives == 1);
        
        
        if (check1 && check2 && check3 && check4 && check5 && check6 && check7) 
        {
            System.out.println("All predictions correct!");
        } 
        else 
        {
            System.out.println("Some predictions are incorrect. Review pre/post increment rules.");
        }
    }
}

/*

Output:

All predictions correct!

NOTE: as && (AND) operator is used, if any of the checks were not matching the actual results
the output would have been the one for the else statement.

*/