import java.util.Scanner;
public class Grammar
{
    public static void main(String[] args)
    {
        int errors=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentece using the word 2 instead of to: ");
        String sentence=input.nextLine();
       
        for(int i=0;i<sentence.length();i++){
         if(sentence.substring(i,i+1).equals("2")){
          errors++;   
         }
        }
        
        System.out.println(useProperGrammar(sentence));
        System.out.println("Fixed "+errors+" grammatical errors:");
        
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
    }
    
    public static String useProperGrammar(String theText)
    {
        
        String newText=theText.replace("2","to");
        return newText;
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
    }
}
