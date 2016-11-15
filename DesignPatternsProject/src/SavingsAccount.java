/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
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
