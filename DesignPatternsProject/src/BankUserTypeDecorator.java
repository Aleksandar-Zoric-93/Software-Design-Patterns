/**
 *
 * @author Aleks
 * Decorator Pattern
 */
public abstract class BankUserTypeDecorator implements BankUserType {
    protected BankUserType decoratedBankUserType;
    
    public BankUserTypeDecorator(BankUserType decoratedBankUserType)
    {
        this.decoratedBankUserType = decoratedBankUserType;
    }
    
    public void setId()
    {
        decoratedBankUserType.assign();
    }
}
