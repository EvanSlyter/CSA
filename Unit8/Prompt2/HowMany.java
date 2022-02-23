public class HowMany {
    private static int count=0;
    
    public static void HowMany(char[][] arr,char target){
     
        for (int i=0;i<arr.length;i++){
            
            for(int k=0;k<arr[i].length;k++){
                if (arr[i][k]==target){
                    count++;   
                }
            }
             
         }
         System.out.println("The " +target+ " count is :: "+count);
    }
}
