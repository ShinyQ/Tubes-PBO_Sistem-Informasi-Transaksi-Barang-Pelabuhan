/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksidermaga;

/**
 *
 * @author ShinyQ
 */
public class ItemSolid extends Item{
    private String shape;
    private int quantity;

    public ItemSolid(int itemID, String name, int weight,String shape, int quantity) {
        super(itemID, name, weight);
        this.shape = shape;
        this.quantity = quantity;
    }
    
    @Override
    public void getItem(){
        System.out.println("\t\tItem info :");
        System.out.println("\t\t\tID \t: " + this.getItemID());
        System.out.println("\t\t\tName \t: " + this.getName());
        System.out.println("\t\t\tWeight \t: " + this.getWeight());
        System.out.println("\t\t\tShape \t: " + this.getShape());
        System.out.println("\t\t\tQuantity: " + this.getQuantity());
    }

    public String getShape() {
        return shape;
    }

    public int getQuantity() {
        return quantity;
    }
    
    
            
}
