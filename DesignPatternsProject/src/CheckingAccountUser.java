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
public class CheckingAccountUser implements BankUserType {

    @Override
    public void assign() {
        System.out.println("User ID: 054");
    }
    
}
