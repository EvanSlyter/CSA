//Copy over your code from the Randomizer class exercise

public class Randomizer
{
    public static int nextInt()
    {
        int number=(int)(Math.random()*11);
        return number;
    }
    
    public static int nextInt(int min, int max)
    {
        int number=(int)(Math.random()* 3 + 1);
        return number;
    }
}
