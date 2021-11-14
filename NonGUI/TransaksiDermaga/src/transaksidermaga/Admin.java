/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksidermaga;

/**
 *
 * @author Hanvito Michael Lee
 */
public class Admin {
    private String name, username, password;
    
    public Admin(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    
    public void getHarbour(Harbour[] h){
        for (int i = 0; i<h.length ; i++){
            h[i].getHarbour();
        }
    }
    
    public Harbour addHarbour(String name, String location){
        return new Harbour(name, location);
    }
    
    public Harbour editHarbour(Harbour h, String name, String location){
        h.setName(name);
        h.setLocation(location);
        return h;
    }
    
    public void getShip(Ship[] s){
        for (int i = 0; i<s.length ; i++){
            s[i].getShip();
        }
    }
    
    public Ship addShip(String name, String number, String arrivalTime){
        return new Ship(name, number, arrivalTime);
    }
    
    public Ship editShip(Ship s, String name, String number, String arrivalTime){
        s.setName(name);
        s.setNumber(number);
        s.setArrivalTime(arrivalTime);
        return s;
    }
    
    public void getItemLiquid(ItemLiquid[] IL){
        for (int i = 0; i<IL.length ; i++){
            IL[i].getItem();
        }
    }
    
    public void getItemSolid(ItemSolid[] IS){
        for (int i = 0; i<IS.length ; i++){
            IS[i].getItem();
        }
    }
    
    public ItemLiquid addItemLiquid(int itemID, String name, String arrivalTime, int weight, int volume, boolean flammable){
        return new ItemLiquid(itemID, name, arrivalTime,  weight, volume, flammable);
    }
    
    public ItemSolid addItemSolid(int itemID, String name, String arrivalTime, int weight, String shape, int quantity){
        return new ItemSolid(itemID, name, arrivalTime, weight, shape, quantity);
    }
    
    public Transaction addTransaction(int ID, int totalCost, String datetime){
        return new Transaction(ID, totalCost, datetime);
    }
    
    public void  getAllTransaction(Transaction[] t){
        for (int i = 0; i<t.length ; i++){
            System.out.println("Transaksi ke-" + (i+1) + ": ");
            t[i].getItem();
        }
    }
    
    public void getAllContainer(Container[] c){
        for (int i = 0; i<c.length ; i++){
            c[i].getContainer();
        }
    }
    
    public Container addContainer(String containerNumber, String containerType, String containerSize){
        return new Container(containerNumber, containerType, containerSize);
    }
    
}
