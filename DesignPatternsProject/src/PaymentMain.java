/*
STRATEGY PATTERN:
Strategy pattern is used when we have multiple algorithms for a specific task 
and client decides the actual implementation to be used at runtime.
In this example the specific task is to pay for an item, and we have two
implementations to be used at runtime, these implementations are the two
different methods the client chooses to pay with.
*/

/**
 *
 * @author Aleksandar Zoric
 */
public class PaymentMain {

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        
        Item item1 = new Item("8743", 23);
        Item item2 = new Item("3247", 14);

        basket.addItem(item1);
        basket.addItem(item2);

        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));

        //pay by credit card
        basket.pay(new CreditCardOption("Joe Bloggs", "8993104687042358", "342", "12/17"));

    }

}
