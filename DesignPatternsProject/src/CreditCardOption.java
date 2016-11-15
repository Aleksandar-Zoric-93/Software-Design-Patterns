/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class CreditCardOption extends User implements PaymentOption {

    private String cardNumber;
    private String cvv;
    private String expiryDate;
    
    public CreditCardOption(String ccNum, String cvv, String expiryDate) {

        this.cardNumber = ccNum;
        this.cvv = cvv;
        this.expiryDate = expiryDate;

    }

    public void pay(int amount) {

        System.out.println("€" + amount + " paid with Credit Card.");

    }

    @Override
    void setName() {
         System.out.println("Name: Joe Bloggs");
    }

    @Override
    void setAccNum() {
        System.out.println("Account Number: 67756645342");
    }

    @Override
    void setAddress() {
         System.out.println("Address: Main Street, Florida");
    }


  
}
