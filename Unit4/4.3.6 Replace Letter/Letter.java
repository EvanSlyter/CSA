import java.util.Scanner;
public class Letter
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word=input.nextLine();
        System.out.println("Enter the letter you want to replace: ");
        String oldLetter=input.nextLine();
        System.out.println("Enter the replacing letter: ");
        String newLetter=input.nextLine();
        String newWord=replaceLetter(word,oldLetter,newLetter);
        System.out.println(newWord);
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace,String replacementLetter)
    {
        
       String newWord= word.replace(letterToReplace,replacementLetter);
       return newWord;
        
    }
}
