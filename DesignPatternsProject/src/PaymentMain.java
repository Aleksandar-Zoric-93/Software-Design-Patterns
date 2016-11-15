/*
STRATEGY PATTERN:
Strategy pattern is used when we have multiple algorithms for a specific task 
and client decides the actual implementation to be used at runtime.
In this example the specific task is to pay for an item, and we have two
implementations to be used at runtime, these implementations are the two
different methods the client chooses to pay with.
*/

/*
TEMPLATE PATTERN:
Define the skeleton of an algorithm in an operation, deferring some steps to client subclasses.
If you look in the User class, the template method is demonstrated there.
By deferring steps to create a user, which is displayed once we run the PaymentMain class.
*/

/**
 *
 * @author Aleksandar Zoric
 */
public class PaymentMain {

    public static void main(String[] args) {
        ShoppingBasket basket = new ShoppingBasket();
        User creditUser = new CreditCardOption("8993104687042358", "342", "12/17");       
        User paypalUser = new PayPalOption("stone@meekness.com", "password");
              
        Item item1 = new Item(creditUser,"8743", 23);
        Item item2 = new Item(paypalUser,"3247", 15);

        basket.addItem(item1);
        basket.addItem(item2);

        paypalUser.createUser();
        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));

         System.out.println("\n");
         
         creditUser.createUser();
        //pay by credit card
        basket.pay(new CreditCardOption("8993104687042358", "342", "12/17"));

    }

}
