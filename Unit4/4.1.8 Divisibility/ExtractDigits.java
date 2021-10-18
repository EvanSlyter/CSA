public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        
        String lengthString=String.valueOf(num);
        int length=lengthString.length();
        int i=length;
        while(i!=0){
        for(i=length; i!=0; i--){
            String number=lengthString.substring(i-1,i);
            Integer.valueOf(number);
            System.out.println(number);
        }
        
        
       
        
        } 
        }
        
    }
