

/**
 *
 * @author Aleks
 * Facade Pattern
 */
public class UserIDGenerator {
    private BankUserType checkingAccUser;
    private BankUserType savingsAccUser;
    
    public UserIDGenerator()
    {
        checkingAccUser = new CheckingAccountUser();
        savingsAccUser = new SavingsAccountUser();
    }
    
    public void setCheckingAccUser()
    {        
        checkingAccUser.assign();
    }
    
    public void setSavingsAccUser()
    {
        savingsAccUser.assign();
    }
}
