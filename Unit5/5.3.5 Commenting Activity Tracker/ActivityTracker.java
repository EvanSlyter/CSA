public class ActivityTracker
{
    public static void main(String[] args)
    {
        //makes a new myLog object
        ActivityLog mylog = new ActivityLog();
        
        //adds miles to the run
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //prints out total miles ran by using the getMiles() function
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        
        double hoursToday = mylog.getHours();
        
        //adds hours to the run
        mylog.addHours(1.5);
        mylog.addHours(3);
        
        //creates a varible to show how many more hours were ran
        double increase = mylog.getHours() - hoursToday;
        
        //prints the increase in hours
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
