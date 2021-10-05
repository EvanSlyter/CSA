import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("First String?");
        String str1=input.nextLine();
        System.out.println("Second String?");
        String str2=input.nextLine();
        System.out.println("Third String?");
        String str3=input.nextLine();
        String superString=str1.concat(str2);
        System.out.println(superString);
        if(superString.equals(str3)){
         System.out.println(str1+" + "+str2+" is equal to "+str3+"!");   
        }
        else{
         System.out.println(str1+" + "+str2+" is not equal to "+str3+"!");   
        }
        // Ask the user for three strings.
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
    }
}
