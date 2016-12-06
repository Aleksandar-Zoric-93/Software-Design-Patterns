
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
