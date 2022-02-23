public class MatrixCount
{
    public static void main(String[] args)
    {
        int[][] matrix=new int[][]{
         {1,2,3,4,5},
         {6,7,8,9,0},
         {6,7,1,2,5},
         {6,7,8,9,0},
         {5,4,3,2,1}
        };
        
        System.out.println("Matrix Values");
        for(int i=0;i<matrix.length;i++){
            
            for (int k=0;k<matrix[i].length-1;k++){
             System.out.print(matrix[i][k]+" ");   
            }
            System.out.println(matrix[i][matrix[i].length-1]);
            
        }
        HowMany.HowMany(matrix,7);
    }
}
