import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter player one's name");
        String p1Name=input.nextLine();
        System.out.println("Enter player two's name");
        String p2Name=input.nextLine();
        System.out.println("Enter "+p1Name+"'s score");
        int p1Score=input.nextInt();
        System.out.println("Enter "+p2Name+"'s score");
        int p2Score=input.nextInt();
        if(p1Name.compareTo(p2Name)<=1||p1Name.compareTo(p2Name)==0){
         System.out.println(p1Name+" scored "+p1Score+" points"); 
         System.out.println(p2Name+" scored "+p2Score+" points");
        }
        else{
            System.out.println(p2Name+" scored "+p2Score+" points");
            System.out.println(p1Name+" scored "+p1Score+" points"); 
        }
        String winner;
        if(p1Score>p2Score){
         winner=p1Name;   
        }
        else{
          winner=p2Name;  
        } 
        System.out.println(winner+" wins!");
        
    }
}
