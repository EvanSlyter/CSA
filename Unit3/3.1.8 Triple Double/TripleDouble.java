import java.util.Scanner;
public class TripleDouble 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many points did you score?");
        int points=input.nextInt();
        System.out.println("How many rebounds did you get?");
        int rebounds=input.nextInt();
        System.out.println("How many assists did you have?");
        int assists=input.nextInt();
        System.out.print("You got 10 or more points: ");
        System.out.println(points>=10);
        System.out.print("You got 10 or more rebounds: ");
        System.out.println(rebounds>=10);
        System.out.print("You got 10 or more assists: ");
        System.out.println(assists>=10);
        // Ask for the three stats
        
        // Create three boolean variables that
        // check if the stats are 10 or more
        
        // Print out the value of each boolean
        // variable.  Be sure to label them!
        
        
    }
}
