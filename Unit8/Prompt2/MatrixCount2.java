public class MatrixCount2
{
    public static void main(String[] args)
    {
       char[][] matrix=new char[20][20]; 
    
        for(int i=0;i<matrix.length;i++){
         
            for(int k=0;k<matrix[i].length;k++){
             
             int num=((int)(Math.random()*3));
             if(num==0){
                  matrix[i][k]=(char)('a'+Math.random()*26);
             }
             else if(num==1){
                matrix[i][k]=(char)('0'+Math.random()*10);                 
             }
             else if(num==2){
                 matrix[i][k]=(char)('A'+Math.random()*26);
             }
             
            }
        }
       
       
       System.out.println("Matrix Values");
        for(int i=0;i<matrix.length;i++){
            
            for (int k=0;k<matrix[i].length-1;k++){
             System.out.print(matrix[i][k]+" ");   
            }
            System.out.println(matrix[i][matrix[i].length-1]);
            
        }
        HowMany.HowMany(matrix,'1');
    }
}
