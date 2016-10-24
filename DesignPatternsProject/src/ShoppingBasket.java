
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
public class ShoppingBasket {

    List<Item> items;

    public ShoppingBasket() 
    {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) 
    {
        this.items.add(item);
    }

    public void removeItem(Item item) 
    {
        this.items.remove(item);
    }

    public int calculateTotal() 
    {
        int sum = 0;
        
        for (Item item : items) 
        {
            sum += item.getPrice();
        }
        return sum;
    }

    
    public void pay(PaymentOption payingMethod) 
    {
        int amount = calculateTotal();
        payingMethod.pay(amount);
    }

}
