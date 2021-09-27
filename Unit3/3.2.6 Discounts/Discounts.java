import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("How many hours have you been parked?");
        int hours=input.nextInt();
        double cost=hours*3.50;
        
        if(cost>20){
            cost=20.0;
            System.out.println("You owe $"+cost);
        }
        else{
         System.out.println("You owe $"+cost);   
        }
        // Create a scanner object
        
        // Ask how many hours were you parked
        
        // Compute cost - $3.50 per hour
        
        // If cost is over $20, set cost to $20
        
        // Display the final cost
        
    }
}
