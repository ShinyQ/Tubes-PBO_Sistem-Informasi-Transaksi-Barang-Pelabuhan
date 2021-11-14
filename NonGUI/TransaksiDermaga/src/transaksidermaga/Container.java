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
public class Container {
    private String number, type, size;
    
    public Container(String containerNumber, String containerType, String containerSize) {
        this.number = containerNumber;
        this.type = containerType;
        this.size = containerSize;
    }
    
    public void getContainer(){
        System.out.println("Container info :");
        System.out.println("\tNo \t: " + this.getContainerNumber());
        System.out.println("\tSize \t: " + this.getContainerSize());
        System.out.println("\tType \t: " + this.getContainerType());
    }
    
    public void editContainer(String containerNumber, String containerType,String containerSize){
        this.number = containerNumber;
        this.type = containerType;
        this.size = containerSize;
    }

    public String getContainerNumber() {
        return number;
    }

    public String getContainerType() {
        return type;
    }

    public String getContainerSize() {
        return size;
    }
    
    
    
}
