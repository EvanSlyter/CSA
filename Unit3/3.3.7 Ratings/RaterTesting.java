public class RaterTesting
{
    public static void main(String[] args)
    {
        Rater r1=new Rater("Evan'sCompany",2.3);
        
        r1.updateReview();
        System.out.println(r1);
        r1.setRating(4.6);
        r1.updateReview();
        System.out.println(r1);
    }
}
