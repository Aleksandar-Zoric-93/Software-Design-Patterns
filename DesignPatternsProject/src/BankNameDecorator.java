/**
 *
 * @author Aleks
 * Decorator Pattern
 */
public class BankNameDecorator extends BankUserTypeDecorator {

    public BankNameDecorator(BankUserType decoratedBankUserType)
    {
        super(decoratedBankUserType);
    }
    @Override
    public void assign() {     
       assignBankName(decoratedBankUserType);
    }
    
    public void assignBankName(BankUserType decoratedBankUserType)
    {
        System.out.println("Bank name: Bank of Ireland\n");
    }
            
            
    
}
