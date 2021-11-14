/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksidermaga;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShinyQ
 */
public abstract class Item implements Arrival{
    private int itemID;
    private String name;
    private int weight;
    private String arrivalTime;

    public Item(int itemID, String name, int weight, String arrivalTime) {
        this.itemID = itemID;
        this.name = name;
        this.weight = weight;
        this.arrivalTime = arrivalTime;
    }
    
    public void getItem(){
        System.out.println("\tItem info :");
        System.out.println("\t\tID \t: " + this.getItemID());
        System.out.println("\t\tName \t: " + this.getName());
        System.out.println("\t\tWeight \t: " + this.getWeight() );
    }
    
    @Override
    public String getArrivalTime(){
        SimpleDateFormat ft = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
        Date date1 = null;  
        try {
            date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(arrivalTime);
        } catch (ParseException ex) {
            Logger.getLogger(Ship.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ft.format(date1);
    }
    
    public void setArrivalTime(String arrivalTime){
        this.arrivalTime = arrivalTime;
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
