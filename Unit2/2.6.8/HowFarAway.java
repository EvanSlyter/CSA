import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the latitude of the starting location: ");
        double lat1=input.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double lon1=input.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double lat2=input.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double lon2=input.nextDouble();
        
        GeoLocation start=new GeoLocation(lat1,lon1);
        GeoLocation end=new GeoLocation(lat2,lon2);
        double distance=start.distanceFrom(end);
        System.out.println("The distance is "+distance+" miles.");
    }
}
