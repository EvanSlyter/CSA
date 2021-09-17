import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter two doubles");
    double num1=input.nextDouble();
    double num2=input.nextDouble();
    Calculator c1=new Calculator();
    double sum=c1.sum(num1,num2);
    double multiply=c1.multiply(num1,num2);
    double divide=c1.divide(num1,num2);
    double subtract=c1.subtract(num1,num2);
    System.out.println(num1+" + "+num2+" = "+sum);
    System.out.println(num1+" - "+num2+" = "+subtract);
    System.out.println(num1+" * "+num2+" = "+multiply);
    System.out.println(num1+" / "+num2+" = "+divide);
    }
}
