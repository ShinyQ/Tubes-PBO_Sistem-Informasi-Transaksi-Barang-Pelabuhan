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
public class Transaction {
    private int transactionID, totalWeight, totalCost;
    private ItemLiquid[] itemLiquid = new ItemLiquid[1];
    private ItemSolid[] itemSolid = new ItemSolid[1];
    private String datetime;
    private int i, k;

    public Transaction(int transactionID, int totalCost, String datetime) {
        this.transactionID = transactionID;
        this.totalCost = totalCost;
        this.datetime = datetime;
    }
    
    public void getAllItem(){
        for (int j = 0;j<itemLiquid.length;j++){
            System.out.println("\titem Liquid ke- " + (j+1) + ": ");
            itemLiquid[j].getItem();
        }
        for (int l = 0;l<itemSolid.length;l++){
            System.out.println("\titem Solid ke- " + (l+1) + ": ");
            itemSolid[l].getItem();
        }
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
    
    public int getTotalWeight(){
        for(int i=0;i<itemLiquid.length;i++){
            totalWeight += itemLiquid[i].getWeight();
            totalWeight += itemSolid[i].getWeight();
        }
        return totalWeight;
    }

    public int getTransactionID() {
        return transactionID;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public String getDatetime() {
        return datetime;
    }
    
    
    
}
