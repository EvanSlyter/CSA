import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;


public class DiverScores
{
    public static void main(String[] args)
    {
        ArrayList<Double> scores=new ArrayList<Double>();
        Scanner input=new Scanner(System.in);
        
        System.out.println("How many divers?");
        
        int numDivers=input.nextInt();
        
        double biggestScore=Double.MIN_VALUE;
        int bestDiver=0;
        for(int k=1;k<numDivers+1;k++){
            
            for(int i=1;i<8;i++){
                System.out.println("Enter score "+i+" for diver number "+k);
                Double num=input.nextDouble();
                scores.add(num); 
            }
            for (int i=0;i<1;i++){
                System.out.println("What was the dive difficulty?");
                Double difficulty=input.nextDouble();
                Collections.sort(scores);
                scores.remove(0);
                scores.remove(scores.size()-1);
                double finalScore=(((scores.get(0)+scores.get(1)+scores.get(2)+scores.get(3)+scores.get(4))/5)*difficulty);
                System.out.println("Diver #"+k+" Score:");
                System.out.println(finalScore);
                
                if(finalScore>biggestScore){
                    biggestScore=finalScore; 
                    bestDiver=k;
                }
            }
            
        }
       System.out.println("The winner is DIVER#"+bestDiver+"!");
        }
        
        
        
        
    }
