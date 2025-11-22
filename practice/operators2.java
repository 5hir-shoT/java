public class operators2 
{
    public static void main(String[] args) 
    {
        int points = 105;
        
        if (points % 7 == 0) 
        {
            points = points + 50;
        }
        if (points % 3 == 2) 
        {
            points = points - 25;
        }
        if (points % 5 == 4) 
        {
            points = points * 2;
        }
        if (points % 2 == 1) 
        {
            points = points / 2;
        }
        
        System.out.println("Final points: " + points);
    }
}

/*

Output:

Final points: 130

NOTE: we can't use break (a java keyword used to form break statements) after if, 
because break works only for LOOPS and SWITCH CASE BlOCKS.

*/