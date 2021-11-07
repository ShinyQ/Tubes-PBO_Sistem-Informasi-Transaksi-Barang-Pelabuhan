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
public class Ship implements Arrival{
    private String shipNumber, shipName;
    private Container[] container = new Container[2];
    protected int i;

    public Ship(String shipNumber, String shipName) {
        this.shipNumber = shipNumber;
        this.shipName = shipName;
    }
    
    public void getShip(){
        System.out.println("Ship info :");
        System.out.println("No \t: " + this.getShipNumber());
        System.out.println("Name \t: " + this.getShipName());
    }
    
    public void editShip(String shipNumber, String shipName){
        this.shipNumber = shipNumber;
        this.shipName = shipName;
    }
    
    public void addContainer(Container C){
        if (i<container.length){
            container[i++] = C;
        }
    }

    public void getAllContainer(){
        getShip();
        for (int j = 0;j<container.length;j++){
            System.out.println("\tContainer ke- " + (j+1) + ": ");
            container[j].getContainer();
        }
    }
    
    public String getShipNumber() {
        return shipNumber;
    }
    
    @Override
    public String getArrivalTime(){
        return "";
    }

    public String getShipName() {
        return shipName;
    }
    
    
}
