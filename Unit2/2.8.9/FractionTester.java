import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
       int num1Numer=1;
       int num1Denom=2;
        Fraction num1=new Fraction(num1Numer,num1Denom);
        System.out.println("Enter the numerator");
       int num2Numer=input.nextInt();
        System.out.println("Enter the denominator");
       int num2Denom=input.nextInt();
        Fraction num2=new Fraction(num2Numer,num2Denom);
        System.out.println(num1+" + "+num2+" = "+);
        System.out.println(((num1Numer*num2Denom)+(num1Denom*num2Numer))+"/"+(num1Denom*num2Denom));
        
        // Ask for input
        
        // Create a new Fraction with the user's input
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        
    }
}
