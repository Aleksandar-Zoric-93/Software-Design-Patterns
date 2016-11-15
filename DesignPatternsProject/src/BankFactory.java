/*
 This is my main class implemented using factory pattern. 
It instantiates a bank instance only after determining its type.
 */

/**
 *
 * @author Aleks
 */
public class BankFactory {
    public static Bank buildBankAccount(BankAccountType accType) {
        Bank bank = null;
        
        switch (accType) {
        case CHECKING_ACC:
            bank = new CheckingAccount();
            break;
 
        case SAVINGS_ACC:
            bank = new SavingsAccount();
            break;
 
       
        default:
            System.out.println("Bank account type not valid.  Try again");
            break;
        }
        return bank;
    }
}
