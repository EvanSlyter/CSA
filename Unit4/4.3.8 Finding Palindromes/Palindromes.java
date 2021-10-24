import java.util.Scanner;
public class Palindromes
{
    /**
     * This program lets the user input some text and
     * prints out whether or not that text is a palindrome.
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Type in your text: ");
        String userWord=input.nextLine();
        if(isPalindrome(userWord)){
         System.out.println("Your word is a palindrome!");   
        }
        else{
         System.out.println("Not a palindrome :(");   
        }
       // Create user input and let user know whether their word is a palindrome or not! 
        
    }
    
    /**
     * This method determines if a String is a palindrome,
     * which means it is the same forwards and backwards.
     * 
     * @param text The text we want to determine if it is a palindrome.
     * @return A boolean of whether or not it was a palindrome.
     */
    public static boolean isPalindrome(String text)
    {
       if(reverse(text).equals(text)){
           return true;
    }
        else{
         return false;   
        }
    }
    
    /**
     * This method reverses a String.
     * 
     * @param text The string to reverse.
     * @return The new reversed String.
     */
    public static String reverse(String text)
    {
        String newWord="";
        for(int i=1;i<=text.length();i++){
        
        newWord=newWord.concat(text.substring(text.length()-i,text.length()-i+1));
        }
        return newWord;
    }

}
