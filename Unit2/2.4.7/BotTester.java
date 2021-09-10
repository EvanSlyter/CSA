import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);
    System.out.println("Hello. What is your name? ");
    String userName= input.nextLine();
    Bot Hal=new Bot(userName);
    Hal.greeting();
    Hal.help();
    System.out.println("What's the weather like?");
    Hal.weather();
    System.out.println("How many feet in a mile?");
    Hal.feetInMile();
    Hal.goodbye();
    }
}

