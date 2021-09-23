public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        Racecar car1=new Racecar(Math.random()*10,"Evan");
        Racecar car2=new Racecar(Math.random()*10,"Steve");
        
        System.out.println("First car finished in "+car1.computeTime(2414)+" seconds");
        System.out.println("Second car finished in "+car2.computeTime(2414)+" seconds");
        
        // Create two Racecar objects
        
        // Compute the finishing times for both cars
        
        // Print times of each car
        
    }
}
