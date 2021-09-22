public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int mid=word.length()/2;
        String firstHalf=word.substring(0,mid) ;      
        String secondHalf=word.substring(mid);
        return secondHalf+firstHalf;
        
        // switch first half
        // and second half
      
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
       String firstPart=word.substring(0,insertIdx);
       String secondPart=word.substring(insertIdx);
        firstPart=firstPart.concat(insertText);
        return firstPart+secondPart;
        // Insert insertText at the position
        // insertIdx
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        int splitSpot=word.indexOf(insertChar);
        String firstPart=word.substring(0,splitSpot);
        String secondPart=word.substring(splitSpot);
        firstPart=firstPart.concat(insertText);
        return firstPart+secondPart;
        // Insert insertText after the first
        // occurence of the insertChar
        
    }
    
    
    public String toString()
    {
        return "["+word+"]";
        // Games[word]
        
    }
    
    
}
