/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
