import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Type a number with no decimals. Ex. 3");
    int num1= input.nextInt();
    System.out.println("Type a second number with no deciamls. Ex. 5");
    int num2= input.nextInt();
    System.out.print("Number 1 divided by number 2: ");
    System.out.println((double)num1/num2);
    

    }
}
