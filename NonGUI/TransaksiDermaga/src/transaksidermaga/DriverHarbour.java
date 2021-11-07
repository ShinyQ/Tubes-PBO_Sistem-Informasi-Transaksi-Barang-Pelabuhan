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
public class DriverHarbour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ship S1 = new Ship("1", "Moby Dick");
        
        Container C1 = new Container("1", "Type 1", "40 x 20 x 20");
        Container C2 = new Container("2", "Type 2", "60 x 30 x 30");
        
        ItemLiquid L1 = new ItemLiquid(1, "Liquid 1", 5, 200, true);    
        ItemSolid IS1 = new ItemSolid(2, "Solid 1", 3, "Kotak" , 5);
        
        ItemLiquid L2 = new ItemLiquid(3, "Liquid 2", 5, 400, false);    
        ItemSolid IS2 = new ItemSolid(4, "Solid 2", 3, "Persegi Panjang" , 1);
        
        Transaction T1 = new Transaction(1, 50000, "26-10-2021");
        Transaction T2 = new Transaction(2, 75000, "1-11-2021");
        
        Customer Cust1 = new Customer("Customer 1", "08212121", "Pangkal Pinang");
        Customer Cust2 = new Customer("Customer 2", "08131313", "Medan");
        
        T1.addItemLiquid(L1);
        T1.addItemSolid(IS1);
        
        T2.addItemLiquid(L2);
        T2.addItemSolid(IS2);
        
        Cust1.addTransaction(T1);
        Cust1.showAllTransaction();
        System.out.println();
        
        Cust2.addTransaction(T2);
        Cust2.showAllTransaction();
        System.out.println();
        
        
        System.out.println();
        System.out.println();
        
        C1.addItemLiquid(L1);
        C1.addItemSolid(IS1);
        C2.addItemLiquid(L1);
        C2.addItemSolid(IS1);
        
        S1.addContainer(C1);
        S1.addContainer(C2);

        S1.getAllContainer();
    }
    
}
