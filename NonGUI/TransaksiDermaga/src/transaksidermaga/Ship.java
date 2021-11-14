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
public class Ship implements Arrival{
    private String number, name;
    private Container[] container = new Container[2];
    protected int i;
    private String arrivalTime;

    public Ship(String shipNumber, String shipName, String arrivalTime) {
        this.number = shipNumber;
        this.name = shipName;
        this.arrivalTime = arrivalTime;
    }
    
    public void getShip(){
        System.out.println("Ship info :");
        System.out.println("No \t: " + this.getShipNumber());
        System.out.println("Name \t: " + this.getShipName());
        System.out.println("Arrive \t: " + this.getArrivalTime());
    }
    
    public void setContainer(Container C){
        if (i<container.length){
            container[i++] = C;
        }
    }

    public void getContainer(){
        getShip();
        for (int j = 0;j<container.length;j++){
            System.out.println("\tContainer ke- " + (j+1) + ": ");
            container[j].getContainer();
        }
    }
    
    public String getShipNumber() {
        return number;
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

    public String getShipName() {
        return name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
