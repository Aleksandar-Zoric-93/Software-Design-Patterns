
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
Using facade to create different type of users i.e. checking account user, savings account user
 */
 /*
SINGLETON PATTERN:
The Singleton's purpose is to control object creation, limiting the number of objects to only one. 
Since there is only one Singleton instance, any instance fields of a Singleton will occur only once per class.
This class demonstrates how Singleton is used and the PaymentGUI class shows how I created a Payment object.
Lazy instantiation.  
 */
/*
DECORATOR PATTERN:
Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
It acts as a wrapper class to an existing class we may have.  In this case, I am going to assign a bank name to each user
without altering the BankUserType interface. 
 */

public class Payment {

    private static Payment instance = null;
    private static int check = 0;

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
        
        BankUserType checkingAccBankName = new BankNameDecorator(new CheckingAccountUser());
        checkingAccBankName.assign();
        
        paypalUser.createUser();
        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.CHECKING_ACC));

        System.out.println("\n*****************************************************\n");

        IDGenerator.setSavingsAccUser();
        
        BankUserType savingsAccBankName = new BankNameDecorator(new SavingsAccountUser());
        savingsAccBankName.assign();
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
      
        BankUserType savingsAccBankName = new BankNameDecorator(new SavingsAccountUser());
        savingsAccBankName.assign();
        
        System.out.println("-----------------------------------------");
        creditUser.createUser();
        //pay by credit card
        basket.pay(new CreditCardOption("8993104687042358", "342", "12/17"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.SAVINGS_ACC));
        System.out.println("-----------------------------------------");
        check = 2;
        displayAllEmployees();
    }

    protected static void displayPayPalUser() {
        ShoppingBasket basket = new ShoppingBasket();
        UserIDGenerator IDGenerator = new UserIDGenerator();
        IDGenerator.setCheckingAccUser();
        User paypalUser = new PayPalOption("stone@meekness.com", "password");

        Item item2 = new Item(paypalUser, "3247", 15);
        basket.addItem(item2);

        BankUserType checkingAccBankName = new BankNameDecorator(new CheckingAccountUser());
        checkingAccBankName.assign();
        
         System.out.println("-----------------------------------------");
        paypalUser.createUser();
        //pay by paypal
        basket.pay(new PayPalOption("stone@meekness.com", "password"));
        System.out.println("-----------------------------------------");
        System.out.println(BankFactory.buildBankAccount(BankAccountType.CHECKING_ACC));
        System.out.println("-----------------------------------------");
        check = 1;
        displayAllEmployees();
    }
    
    
    protected static void displayAllEmployees() {

        Employee bankManagerChecking = new Employee("Ger", "Manager", 50000);
        Employee bankTellerChecking = new Employee("Tim", "Bank Teller", 30000);
        Employee clerkChecking = new Employee("Mike", "Clerk", 25000);

        Employee bankManagerSavings = new Employee("Shaun", "Manager", 45000);
        Employee bankTellerSavings = new Employee("Tom", "Bank Teller", 15000);
        Employee clerkSavings = new Employee("Barack", "Clerk", 25000);

        bankManagerChecking.add(bankTellerChecking);
        bankManagerChecking.add(clerkChecking);

        bankManagerSavings.add(bankTellerSavings);
        bankManagerSavings.add(clerkSavings);

        if (check == 1) {
            for (Employee checkingEmployee : bankManagerChecking.getEmployees()) {
                System.out.println(checkingEmployee);
            }
        }

        if (check == 2) {
            for (Employee savingsEmployee : bankManagerSavings.getEmployees()) {
                System.out.println(savingsEmployee);
            }
        }
    }
       
}
