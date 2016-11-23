/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
