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
    

    public ItemLiquid(int itemID, String name, String arrivalTime, int weight, int volume, boolean flammable) {
        super(itemID, name, weight, arrivalTime);
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
        System.out.println("\tItem info :");
        System.out.println("\t\tID \t: " + this.getItemID());
        System.out.println("\t\tName \t: " + this.getName());
        System.out.println("\t\tWeight \t: " + this.getWeight());
        System.out.println("\t\tVolume \t: " + this.getVolume());
        System.out.println("\t\tIs Flammable \t: " + this.isFlammable());
        System.out.println("\t\tArrival Time \t: " + this.getArrivalTime());
    }
    
    
}
