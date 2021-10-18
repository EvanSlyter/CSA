import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        int largest;
        int smallest;
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number (-1 to quit): ");
        int nextNum = input.nextInt();
        largest = nextNum;
        smallest = nextNum;
        
        while(nextNum != -1){
        
        if(nextNum>largest){
         largest=nextNum;   
        }
        
        if(nextNum<smallest){
         smallest=nextNum;   
        }
        
         System.out.println("Smallest # so far: " + smallest);
         System.out.println("Largest # so far: " + largest);
         
         System.out.println("Enter a number (-1 to quit): ");
         nextNum=input.nextInt();
        }
        
        
    }
}
