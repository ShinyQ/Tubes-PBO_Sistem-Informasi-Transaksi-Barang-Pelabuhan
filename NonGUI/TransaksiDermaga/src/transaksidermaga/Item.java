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
public class Item implements Arrival{
    private int itemID;
    private String name;
    private int weight;

    public Item(int itemID, String name, int weight) {
        this.itemID = itemID;
        this.name = name;
        this.weight = weight;
    }
    
    public void getItem(){
        System.out.println("\tItem info :");
        System.out.println("\t\tID \t: " + this.getItemID());
        System.out.println("\t\tName \t: " + this.getName());
        System.out.println("\t\tWeight \t: " + this.getWeight() );
    }
    
    public void editItem(int itemID, String name, int weight){
        this.itemID = itemID;
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String getArrivalTime(){
        return "";
    }

    public int getItemID() {
        return itemID;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    
}
