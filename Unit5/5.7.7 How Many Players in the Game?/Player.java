public class Player 
{
    public static int totalPlayers=0;
    public static int maxPlayers=10;
    
    // Public Methods
    public Player() 
    {
        totalPlayers++;
    }
    
    public static boolean gameFull()
    {
        return totalPlayers>=maxPlayers;
    }
    // Static Methods 
    // ...
}
