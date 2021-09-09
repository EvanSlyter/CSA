public class Website
{
    // Put your code here
    
    private String domain;
    private String topLevelDomain;
    private int numUsers;
    
    public Website(){
        this.domain="";
        this.topLevelDomain="com";
        this.numUsers=0;
    }
    
    public Website(String domain, String topLevelDomain){
     this.domain=domain;
     this.topLevelDomain=topLevelDomain;
     this.numUsers=0;
    }
    
    public Website(String domain, String topLevelDomain, int numUsers){
     this.domain=domain;
     this.topLevelDomain=topLevelDomain;
     this.numUsers=numUsers;
    }
    
    
    
    // String representation for printing
    // Do not modify this method
    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";
        
        return res;
    }
}
