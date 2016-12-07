
/**
 *
 * @author Aleks
 */
public abstract class Bank {
    
    public Bank(BankAccountType accType) {
        this.accType = accType;
        arrangeAccounts();
    }
    
        private void arrangeAccounts() {
        System.out.println("Bank account type: ");
    }
 
    protected abstract void construct();
 
    private BankAccountType accType = null;
 
    public BankAccountType getAccountType() {
        return accType;
    }
 
    public void setAccountType(BankAccountType accType) {
        this.accType = accType;
    }
}
