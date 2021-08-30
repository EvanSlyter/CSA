import java.util.Scanner;
public class MagicNumber
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("To start, think of any number");
        input.nextLine();
        System.out.println("Subtract 2 from your number");
        input.nextLine();
        System.out.println("Multiply your number by 3");
        input.nextLine();
        System.out.println("Add 12 to your number");
        input.nextLine();
        System.out.println("Divide your number by 3");
        input.nextLine();
        System.out.println("Add five to your number");
        input.nextLine();
        System.out.println("Finally, subtract your original number from your current number");
        input.nextLine();
        System.out.println("Your number should now be 8 :)");
        
    }
}
