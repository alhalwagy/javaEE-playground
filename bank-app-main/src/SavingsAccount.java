public class SavingsAccount extends Account{
   float rateInterest;

    public SavingsAccount( String holderName ,float rateInterest) {
        super( holderName);
        this.rateInterest = rateInterest;
    }

    double calculateRateInterest(){
        return  this.balance * rateInterest;
    }
}
