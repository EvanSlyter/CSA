public class Randomizer
{
    public static int nextInt()
    {
        int randInteger = (int)(Math.random() * 10 + 1);
        return randInteger;
    }
    
    public static int nextInt(int min, int max)
    {
        int randInteger = (int)(Math.random() * (max-min) + min);
        return randInteger;
        //Implement this method to return a random integer between min and max
    }
}
