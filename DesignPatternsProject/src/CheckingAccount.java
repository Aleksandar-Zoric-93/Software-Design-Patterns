

/**
 *
 * @author Aleks
 */
public class CheckingAccount extends Bank {

    public CheckingAccount() {
        super(BankAccountType.CHECKING_ACC);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Checking for account type...");
    }

   
    
}
