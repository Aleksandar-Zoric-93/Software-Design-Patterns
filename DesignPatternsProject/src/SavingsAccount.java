
/**
 *
 * @author Aleks
 * Facade Pattern
 */
public class SavingsAccount extends Bank {
     public SavingsAccount() {
        super(BankAccountType.SAVINGS_ACC);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Checking for account type...");
    }
}
