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
    private String containerNumber, containerType, containerSize;
    private ItemLiquid[] itemLiquid = new ItemLiquid[1];
    private ItemSolid[] itemSolid = new ItemSolid[1];
    protected int i, k;
    

    public Container(String containerNumber, String containerType, String containerSize) {
        this.containerNumber = containerNumber;
        this.containerType = containerType;
        this.containerSize = containerSize;
    }
    
    public void addItemLiquid(ItemLiquid L){
        if (i<itemLiquid.length){
            itemLiquid[i++] = L;
        }
    }
    
    public void addItemSolid(ItemSolid S){
        if (k<itemSolid.length){
            itemSolid[k++] = S;
        }
    }
    
    public void getAllItem(){
        for (int j = 0;j<itemLiquid.length;j++){
            System.out.println("\t\titem Liquid ke- " + (j+1) + ": ");
            itemLiquid[j].getItem();
        }
        for (int l = 0;l<itemSolid.length;l++){
            System.out.println("\t\titem Solid ke- " + (l+1) + ": ");
            itemSolid[l].getItem();
        }
    }
    
    public void getContainer(){
        System.out.println("\tContainer info :");
        System.out.println("\t\tNo \t: " + this.getContainerNumber());
        System.out.println("\t\tSize \t: " + this.getContainerSize());
        System.out.println("\t\tType \t: " + this.getContainerType());
        getAllItem();
    }
    
    public void editContainer(String containerNumber, String containerType,String containerSize){
        this.containerNumber = containerNumber;
        this.containerType = containerType;
        this.containerSize = containerSize;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public String getContainerType() {
        return containerType;
    }

    public String getContainerSize() {
        return containerSize;
    }
    
    
    
}
