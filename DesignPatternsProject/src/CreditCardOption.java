/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class CreditCardOption implements PaymentOption {

    private String nameOnCard;
    private String cardNumber;
    private String cvv;
    private String expiryDate;

    public CreditCardOption(String nm, String ccNum, String cvv, String expiryDate) {

        this.nameOnCard = nm;

        this.cardNumber = ccNum;

        this.cvv = cvv;

        this.expiryDate = expiryDate;

    }

    public void pay(int amount) {

        System.out.println(amount + " paid with Credit Card.");

    }
}
