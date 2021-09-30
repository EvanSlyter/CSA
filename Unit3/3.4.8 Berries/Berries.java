import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the initials of the berry: ");
        char berry=input.nextLine().charAt(0);
        
        if(berry=='r'){
         System.out.println("You ordered raspberry");   
        }
        else if(berry=='h'){
         System.out.println("You ordered huckleberry");
        }
        else if(berry=='g'){
         System.out.println("You ordered goji berry");   
        }
        else{
         System.out.println("Berry not recognized");   
        }
        // Ask for a berry initial
        
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        
        
        // Now you can compare characters using ==
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}
