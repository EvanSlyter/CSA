import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a month as an integer");
        int month=input.nextInt();
        
        if(month<3){
         System.out.println("Not spawning season");   
        }
        else if(month <=6){
         System.out.println("Spring spawning season");   
        }
        else if(month<9){
            System.out.println("Not spawning season");
        }
        else if(month<=11){
         System.out.println("Fall spawning season");   
        }
        else{
            System.out.println("Not spawning season");
        }
        // Ask user for month of year as an integer
        
        // Use if/else if/else statement to determine if it is spawning season
        
    }
}
