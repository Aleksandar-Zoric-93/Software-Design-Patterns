/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
