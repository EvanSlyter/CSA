import java.util.Scanner;
public class Password
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password=input.nextLine();
        if(passwordCheck(password)){
         System.out.println("The password is valid");   
        }
        else{
         System.out.println("The password is not valid");   
        }
        // Prompt the user to enter their password and pass their string
        // to the passwordCheck method to determine if it is valid.
    }
    
    public static boolean passwordCheck(String password)
    {
        String lettersnumbers="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        for (int i=0;i<password.length();i++){
         if(lettersnumbers.indexOf(password.substring(i,i+1))==-1||password.length()<8){
          return false;   
         }
         
        }
        return true;
        // Create this method so that it checks to see that the password
        // is at least 8 characters long and only contains letters 
        // and numbers.
    }
}
