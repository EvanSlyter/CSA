import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input=new Scanner(System.in);
        Extremes object1=new Extremes();
        
        // Create an Extremes object
        
        System.out.println("Guess the maximum value of an integer");
        int maxGuess=input.nextInt();
        // Ask the user to guess the maximum value of an Integer
        System.out.println(object1.maxDiff(maxGuess));
        
        // Compute and display the difference
        // between the max and the guess
        
        System.out.println("Guess the minimum value of an integer");
        int minGuess=input.nextInt();
        // Ask the user to guess the minimum value of an Integer
        System.out.println(object1.minDiff(minGuess));
        
        // Compute and display the difference 
        // between the min and the guess
        
        
    }
}
