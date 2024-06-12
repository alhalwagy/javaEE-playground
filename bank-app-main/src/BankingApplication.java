
import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

      Bank bank = new Bank();
      Scanner scanner = new Scanner(System.in);

        System.out.println("Do you have an account ?");
        System.out.println("Press 1 for yse || 0 for No");

        String input = scanner.next();

        switch (input) {
            case "1": {
                System.out.println("please enter your Name");
                input = scanner.next();
                Account account = bank.getAccount(input);
                if (account == null) {
                    System.out.println("Account not found.");
                    break;
                }
                System.out.println("your account is " + account);
                break;
            }
            case "0":{

                System.out.println("Do you want to create a new account ?");
                System.out.println("Press 1 for yse || 0 for No");
                input = scanner.next();
                switch (input){
                    case "1":{
                        System.out.println("Enter account name");
                        String name = scanner.next();


                       bank.addAccount(name);

                       break;

                    }
                    case "0":{

                        System.out.println("Thanks for your time.");
                        break;

                    }
                }
            }
        }


    }
}