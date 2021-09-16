import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name=input.nextLine();
    Bot2 chatter=new Bot2(name);
    chatter.greeting();
    
    System.out.println("What is your favorite animal?");
    String animal=input.nextLine();
    chatter.favoriteAnimal(animal);
    
    System.out.println("Where do you live?");
    String live=input.nextLine();
    chatter.home(live);
    
    System.out.println("What is your favorite number?");
    int favNum=input.nextInt();
    chatter.favoriteNumber(favNum);
    chatter.goodbye();
    
    
    }
}
