

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
By deferring steps to create a user, which is displayed once we run the Payment class.
 */
 /*
FACTORY METHOD PATTERN:
Define an interface for creating an object, but let subclasses decide which class to instantiate. 
Factory Method lets a class defer instantiation to subclasses.  As you can see, BankFactory is able to
return any type of Bank instance it is requested for.  This will help us if changes need to be made
in the bank account creating process without touching the composing classes i.e classes using BankFactory
 */
 /*
FACADE PATTERN:
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.
This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.
 */
 /*
SINGLETON PATTERN:
The Singleton's purpose is to control object creation, limiting the number of objects to only one. 
Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class.
This class demonstrates how Singleton is used and the PaymentGUI class shows how I created a Payment object.
 */

public class Payment {

    private static Payment instance = null;

    private Payment() {
        // Exists only to defeat instantiation.
    }

    public static Payment getInstance() {
        if (instance == null) {
            instance = new Payment();
        }
        return instance;
    }

    protected static void displayAllData() {
        ShoppingBasket basket = new ShoppingBasket();
        User creditUser = new CreditCardOption("8993104687042358", "342", "12/17");
        User paypalUser = new PayPalOption("stone@meekness.com", "password");

        Item item1 = new Item(creditUser, "8743", 23);
        Item item2 = new Item(paypalUser, "3247", 15);

        basket.addItem(item1);
        basket.addItem(item2);

        UserIDGenerator IDGenerator = new UserIDGenerator();
        IDGenerator.setCheckingAccUser();
        paypalUser.createUser();
        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.CHECKING_ACC));

        System.out.println("\n*****************************************************\n");

        IDGenerator.setSavingsAccUser();
        creditUser.createUser();
        //pay by credit card
        basket.pay(new CreditCardOption("8993104687042358", "342", "12/17"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.SAVINGS_ACC));
    }

    protected static void displayCreditUser() {
        ShoppingBasket basket = new ShoppingBasket();
        UserIDGenerator IDGenerator = new UserIDGenerator();
        IDGenerator.setSavingsAccUser();
        User creditUser = new CreditCardOption("8993104687042358", "342", "12/17");

        Item item1 = new Item(creditUser, "8743", 23);
        basket.addItem(item1);

        creditUser.createUser();
        //pay by credit card
        basket.pay(new CreditCardOption("8993104687042358", "342", "12/17"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.SAVINGS_ACC));
    }

    protected static void displayPayPalUser() {
        ShoppingBasket basket = new ShoppingBasket();
        UserIDGenerator IDGenerator = new UserIDGenerator();
        IDGenerator.setCheckingAccUser();
        User paypalUser = new PayPalOption("stone@meekness.com", "password");

        Item item2 = new Item(paypalUser, "3247", 15);
        basket.addItem(item2);

        paypalUser.createUser();
        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.CHECKING_ACC));
    }

}
