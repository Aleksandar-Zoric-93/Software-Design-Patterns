/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class PayPalOption implements PaymentOption {

    private String email;
    private String password;

    public PayPalOption(String email, String password) 
    {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) 
    {
        System.out.println(amount + " paid using Paypal.");
    }

}
