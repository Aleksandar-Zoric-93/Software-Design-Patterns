

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
