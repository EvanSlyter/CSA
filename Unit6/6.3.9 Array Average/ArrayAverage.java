public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
      int combination=0;
       for (int i : values){
        
        combination= combination+i;
        
        
           
       }
       return  (double) combination/values.length;
   }
}
