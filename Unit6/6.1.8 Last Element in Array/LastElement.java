public class LastElement
{
    public static void main(String[] args)
    {
        String[] arr = new String[]{"hello", "my name", "world", "Karel"};
        String lastElement=getLastElement(arr);
        System.out.println("The last element of the String array is: "+lastElement);
        //get and print the last element of the array
    }

    public static String getLastElement(String[] arr)
    {
        String lastElement=arr[arr.length-1];
        return lastElement;
    }
}
