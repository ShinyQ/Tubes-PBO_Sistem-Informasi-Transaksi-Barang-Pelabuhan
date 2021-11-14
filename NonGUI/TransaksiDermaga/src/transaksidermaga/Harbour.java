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
public class Harbour {
    private String name, location;

    public Harbour(String harbourName, String location) {
        this.name = harbourName;
        this.location = location;
    }
    
    public void getHarbour(){
        System.out.println("Name \t: " + this.getName());
        System.out.println("Location: " + this.getLocation());
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
