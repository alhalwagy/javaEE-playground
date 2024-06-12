public class Account {

    int number=0;
    String holderName;
    double balance=0.0 ;

    public Account( String holderName) {
        this.number = this.number +1;
        this.holderName = holderName;
    }

    void withdraw(double amount){
        if(this.balance>= amount){
            this.balance -=amount;
            System.out.println("Your balance now "+this.balance);
        }else {
            System.out.println("failed operation. your balance is"+this.balance);
        }
    }


    void deposit (double amount){
        this.balance +=amount;
        System.out.println("Your balance now "+this.balance);
    }



}
