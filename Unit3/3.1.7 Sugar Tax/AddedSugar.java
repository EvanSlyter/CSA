import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("How many grams of sugar have you eaten today?");
        int grams=input.nextInt();
        boolean canEat=grams<30;
        System.out.println(canEat);
        // Ask the user for the grams of sugar
        
        // Use a boolean expression to print if they can eat more sugar
    }
}
