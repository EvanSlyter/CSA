import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
        String userWord=input.nextLine();
        WordGames word1= new WordGames(userWord);
        System.out.println(word1.scramble());
        // Ask for a word
        
        // Scramble it
        // Print out scrambled word 
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String userWord2 = input.nextLine();
          System.out.println( word1.bananaSplit(idx,userWord2));
        
        
        // Add random word at index
        // Print out the word
        
        System.out.println("Enter a character in the original word");
        String userChar=input.nextLine();
        System.out.println("Enter another word");
        String userWord3=input.nextLine();
        System.out.println(word1.bananaSplit(userChar,userWord3));
        // Ask for a character (store as a String)
        // Ask for random word
        // Add random word at character
        // Print out the word
        
        
        
    }
}
