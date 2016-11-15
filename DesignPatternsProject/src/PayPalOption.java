/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class PayPalOption extends User implements PaymentOption {

    private String email;
    private String password;

    public PayPalOption(String email, String password) 
    {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) 
    {
        int extraCharge = 1;
        amount += extraCharge;
        System.out.println("€" + amount + " paid using Paypal.");
    }

    @Override
    void setName() {
         System.out.println("Name: Tom Briggs");
    }

    @Override
    void setAccNum() {
        System.out.println("Account Number: 54432327543");
    }

    @Override
    void setAddress() {
        System.out.println("Address: Queens, New York");
    }

    
}
