public class ActivityLog
{
    private double numHours;
    private double numMiles;
    
    //variables set to zero
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    //add hours to numHours
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    //add miles to numMiles
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    //returns miles
    public double getMiles()
    {
        return numMiles;
    }
    
    //returns hours
    public double getHours() 
    {
        return numHours;
    }
    
}
