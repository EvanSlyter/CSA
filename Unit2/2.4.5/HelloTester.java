import java.util.Scanner;

public class HelloTester
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("please input your name");
        String nameInput=input.nextLine();
        Hello userName=new Hello(nameInput);
        userName.english();
        userName.spanish();
        userName.french();
        
    }
}
