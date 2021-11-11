import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        
     if(user.equals("scissors")){
            if(computer.equals("paper")){
                return USER_PLAYER;
            }
            
            else if(computer.equals("rock")){
                return COMPUTER_PLAYER;  
            }
            
            else{
                return TIE;   
            }
        }
        
         if(user.equals("paper")){
            if(computer.equals("rock")){
                return USER_PLAYER;
            }
            
            else if(computer.equals("scissors")){
                return COMPUTER_PLAYER;  
            }
            
            else{
                return TIE;   
            }
        }
        
         if(user.equals("rock")){
            if(computer.equals("scissors")){
                return USER_PLAYER;
            }
            
            else if(computer.equals("paper")){
                return COMPUTER_PLAYER;   
            }
            
            else{
                return TIE;   
            }
        }
        return "Make sure to choose either rock, paper, or scissors";
    }
    
    public static void main(String[] args)
    {
        
        
        
        Scanner input=new Scanner(System.in);
        while(true){
        System.out.println("Enter your choice (rock, paper, or scissors): ");
        String userChoice=input.nextLine();
        userChoice=userChoice.toLowerCase();
        int computerNum=Randomizer.nextInt(1,3);
        
        if(userChoice.equals("")){
             break;   
            }
        if(computerNum==1){
            
         String computerChoice="rock";
         System.out.println("User: "+userChoice);
         System.out.println("Computer: "+computerChoice);
         System.out.println(getWinner(userChoice,computerChoice));
        }
        
        else if(computerNum==2){
            
         String computerChoice="paper";
         System.out.println("User: "+userChoice);
         System.out.println("Computer: "+computerChoice);
         System.out.println(getWinner(userChoice,computerChoice));
        }
        
        else{
            
         String computerChoice="scissors"; 
         System.out.println("User: "+userChoice);
         System.out.println("Computer: "+computerChoice);
         System.out.println(getWinner(userChoice,computerChoice));
        }
         
        }
        System.out.println("Thanks for playing!");
    
    }
}
