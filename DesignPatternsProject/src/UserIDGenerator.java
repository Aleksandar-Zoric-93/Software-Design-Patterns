/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
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
        checkingAccUser.setID();
    }
    
    public void setSavingsAccUser()
    {
        savingsAccUser.setID();
    }
}
