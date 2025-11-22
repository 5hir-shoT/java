public class operators3 
{
    public static void main(String[] args) 
    {
        
        int lives = 3;
        int score = 100;
        int level = 1;
        int coins = 5;
        
        lives--;
        lives--;
        coins++;
        coins++;
        coins++;
        lives++;
        level++;
        coins--;
        coins--;
        coins--;
        coins--;
        
        System.out.println("Game Status:");
        System.out.println("-----------");
        System.out.println("Lives: " + lives);
        System.out.println("Score: " + score);
        System.out.println("Level: " + level);
        System.out.println("Coins: " + coins);
    }
}

/*

Output:

Game Status:
-----------
Lives: 2
Score: 100
Level: 2
Coins: 4

*******************
One could also use:

        lives-=2;
        coins+=3;
        lives+=1;
        level+=1;
        coins-=4;
*******************

*/