
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

        Employee managerChecking = new Employee("Ger", "Manager", 50000);
        Employee handlerChecking = new Employee("Tim", "Handler", 30000);
        Employee courierChecking = new Employee("Mike", "Courier", 25000);

        Employee managerSavings = new Employee("Shaun", "Manager", 45000);
        Employee handlerSavings = new Employee("Tom", "Handler", 15000);
        Employee courierSavings = new Employee("Barack", "Courier", 25000);

        managerChecking.add(handlerChecking);
        managerChecking.add(courierChecking);

        managerSavings.add(handlerSavings);
        managerSavings.add(courierSavings);

        if (check == 1) {
            for (Employee checkingEmployee : managerChecking.getEmployees()) {
                System.out.println(checkingEmployee);
            }
        }

        if (check == 2) {
            for (Employee savingsEmployee : managerSavings.getEmployees()) {
                System.out.println(savingsEmployee);
            }
        }
    }
       
}
