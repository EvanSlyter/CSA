import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Welcome to the game :)");
        System.out.println("First choice: [1] Pizza or [2] Burgers");
        
        int c1=input.nextInt();
        if(c1==1){
            System.out.println("You chose Pizza, good choice");
            System.out.println("Second choice: [1] Eat Out or [2] Order Delivery");
            
            int c2=input.nextInt();
                
                if(c2==1){
                    System.out.println("You chose to Eat Out");
                    System.out.println("Congratulations, you've finished the game");
                }
                else if(c2==2){
                    System.out.println("You chose to Order Delivery");
                    System.out.println("Congratulations, you've finished the game");
                }
                else{
                    System.out.println("Please type either 1 or 2"); 
                }
        }
        else if(c1==2){
            System.out.println("You chose Burgers, good choice");
            System.out.println("Second choice: [1] Make Your Own or [2] Go to a Restaurant");
            
            int c2=input.nextInt();
            
            if(c2==1){
                    System.out.println("You chose to Make your Own");
                    System.out.println("Congratulations, you've finished the game");
                }
                else if(c2==2){
                    System.out.println("You chose to Go to a Restaurant");
                    System.out.println("Congratulations, you've finished the game");
                }
                else{
                    System.out.println("Please type either 1 or 2"); 
                }
        }
        else{
            System.out.println("Please type either 1 or 2");   
        }
        

        
    }
    
}
