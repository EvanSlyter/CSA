import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=input.nextInt();
        int num2=input.nextInt();
        // Ask for two numbers
        System.out.print(num1+" < "+num2+" ");
        System.out.println(num1<num2);
        
        System.out.print(num1+" == "+num2+" ");
        System.out.println(num1==num2);
        
        System.out.print(num1+" > "+num2+" ");
        System.out.println(num1>num2);
        // Compare the numbers as instructed
        
        // Display the results
    }
}
