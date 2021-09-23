public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        int bigValue=(int)(value*100);
        String withCents=String.valueOf(bigValue);
        String noCents=withCents.substring(0,withCents.length()-2);
        return Integer.valueOf(noCents);
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        int bigValue=(int)(value*100);
        String withDollar= String.valueOf(bigValue);
        String noDollar=withDollar.substring(withDollar.length()-2);
        return Integer.valueOf(noDollar);
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        return "$"+getDollars()+"."+getCents();
    }
}
