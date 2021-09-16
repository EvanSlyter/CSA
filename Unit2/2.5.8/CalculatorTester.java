import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
       Calculator c1=new Calculator();
       System.out.println("Enter two doubles");
       double num1=input.nextDouble();
       double num2=input.nextDouble();
       c1.sum(num1,num2);
       c1.multiply(num1,num2);
       c1.divide(num1,num2);
       c1.subtract(num1,num2);
    }
}
