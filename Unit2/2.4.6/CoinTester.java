public class CoinTester
{
    public static void main(String[] args) {

      Coins bank= new Coins(4,3,2,1);
      bank.addPenny();
      bank.addQuarter();
      bank.addDime();
      bank.addQuarter();
      bank.addDime();
      bank.bankCount();
      bank.bankValue();
      
    }
}

