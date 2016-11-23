/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
