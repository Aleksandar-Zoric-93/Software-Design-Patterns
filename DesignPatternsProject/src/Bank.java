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
        arrangeParts();
    }
    
        private void arrangeParts() {
        System.out.println("Bank account type: ");
    }
 
    protected abstract void construct();
 
    private BankAccountType accType = null;
 
    public BankAccountType getModel() {
        return accType;
    }
 
    public void setModel(BankAccountType accType) {
        this.accType = accType;
    }
}
