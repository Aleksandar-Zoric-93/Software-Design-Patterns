
/**
 *
 * @author Aleks
 */
public abstract class User {
    abstract void setName();
    abstract void setAccNum();
    abstract void setAddress();
       
    public final void createUser()
    {
        setName();
        setAccNum();
        setAddress();
    }
         
}
