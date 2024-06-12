public class Bank {

    private static int index = 0;
    static  Account [] accounts =new Account[100];



    void addAccount(String name){
        Account account = new Account(name);
     accounts[index] = account;
        index++;

    }

    void withdraw(Account account,double amount){

        if(account.balance>=amount) {
            account.balance -= amount;
            System.out.println("Withdraw done. Your balance now "+account.balance);
        }else {
            System.out.println("failed operation. your balance is"+account.balance);
        }

    }

    void deposit(Account account,double amount){
        account.balance += amount;
        System.out.println("Deposit added. Your balance now "+account.balance);
    }

    void displayBalance(Account account){
        System.out.println("Your balance now "+account.balance);
    }

    Account getAccount(String name){
        for (int i=0;i<=accounts.length; i++ ){
            System.out.println(accounts);
            if(accounts[i].holderName == name){
                return accounts[i];
            }
        }
return null;
    }

}
