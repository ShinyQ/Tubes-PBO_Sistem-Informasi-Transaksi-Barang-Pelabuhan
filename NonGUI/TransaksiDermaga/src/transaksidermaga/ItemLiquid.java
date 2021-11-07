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
public class ItemLiquid extends Item{
    private int volume;
    private boolean flammable;
    

    public ItemLiquid(int itemID, String name, int weight, int volume, boolean flammable) {
        super(itemID, name, weight);
        this.volume = volume;
        this.flammable = flammable;
    }
    
    public int getVolume() {
        return volume;
    }

    public boolean isFlammable() {
        return flammable;
    }
    
    @Override
    public void getItem(){
        System.out.println("\t\tItem info :");
        System.out.println("\t\t\tID \t: " + this.getItemID());
        System.out.println("\t\t\tName \t: " + this.getName());
        System.out.println("\t\t\tWeight \t: " + this.getWeight());
        System.out.println("\t\t\tVolume \t: " + this.getVolume());
        System.out.println("\t\t\tIs Flammable \t: " + this.isFlammable());
    }
    
    
}
