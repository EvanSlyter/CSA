public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        
        
        double angle1=Math.PI/2;
        double angle2=Math.PI;
        double cos1=Math.cos(angle1);
        cos1=Math.round(cos1*100)/100;
        double sin1=Math.sin(angle1);
        sin1=Math.round(sin1*100)/100;
        double cos2=Math.cos(angle2);
        cos2=Math.round(cos2*100)/100;
        double sin2=Math.sin(angle2);
        sin2=Math.round(sin2*100)/100;
        System.out.println(0.0 + ": " +Math.cos(0)+", "+Math.sin(0));
        System.out.println(angle1+": "+cos1+", "+sin1);
        System.out.println(angle2+": "+cos2+", "+sin2);
       
    }
}
