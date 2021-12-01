public class SnapShot
{
    public static void main(String[] args)
    {
        String[] words={"Welcome","to","the snap shot","app"};
        
        for(int i=0;i<4;i++){
         System.out.println(words[i]);   
        }
        
        System.out.println();
        words[0]="Upgrade";
        words[3]="premium app!";
        
        for(int i=0;i<4;i++){
         System.out.println(words[i]);   
        }
    }
}
