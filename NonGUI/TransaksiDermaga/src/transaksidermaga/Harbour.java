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
    private String harbourName;

    public Harbour(String harbourName) {
        this.harbourName = harbourName;
    }
    
    public void getHarbour(){
        System.out.println("Name \t: " + this.getHarbourName());
    }
    
    public void editHarbour(String harbourName){
        this.harbourName = harbourName;
    }

    public String getHarbourName() {
        return harbourName;
    }
    
    
}
