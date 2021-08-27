import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Please type a number with a decimal. Ex: 3.2");       
        double myDouble=input.nextDouble();
        int myInt=(int)myDouble;
        System.out.println(myInt);
    }
}
