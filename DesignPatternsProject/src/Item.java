/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aleks
 */
public class Item {

    private String itemCode;
    private int price;

    public Item(String upc, int cost) 
    {
        this.itemCode = upc;
        this.price = cost;
    }

    public String getUpcCode() 
    {
        return itemCode;
    }

    public int getPrice() 
    {
        return price;
    }
}
