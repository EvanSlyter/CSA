import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sales tax rate:");
        double taxrate=input.nextDouble();
        System.out.println("How many boards do you need?");
        int boards=input.nextInt();
        System.out.println("How many windows do you need?");
        int windows=input.nextInt();
        
        Construction c1=new Construction(8,11,taxrate);
        double lumberCost=c1.lumberCost(boards);
        double windowCost=c1.windowCost(windows);
        System.out.println("Total: "+(lumberCost+windowCost));
        double grandTotal=(c1.grandTotal(lumberCost+windowCost));
        System.out.println("Grand Total: "+grandTotal);
    }
}
