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
        Admin admin1 = new Admin("Mikel", "krobus", "kro000");
        
        Harbour H1 = admin1.addHarbour("harbour 1", "jakpus");
        Harbour H2 = admin1.addHarbour("harbour 2", "jaksel");
        
        Ship S1 = admin1.addShip("1", "Moby Dick", "2021-09-19 15:32:30");
        
        Container C1 = admin1.addContainer("1", "Type 1", "40 x 20 x 20");
        Container C2 = admin1.addContainer("2", "Type 2", "60 x 30 x 30");
        
        ItemLiquid IL1 = admin1.addItemLiquid(1, "Liquid 1", "2021-09-19 15:32:30", 5, 200, true);
        
        ItemSolid IS1 = admin1.addItemSolid(2, "Solid 1","2021-09-19 15:32:30", 3, "Kotak" , 5);
        
        Transaction T1 = admin1.addTransaction(1, 50000, "26-10-2021");
        T1.addItemLiquid(IL1);
        T1.addItemSolid(IS1);
        
        Customer Cust1 = new Customer("username", "password", "name", "phone", "address");
        Cust1.addTransaction(T1);
        
        Harbour[] h = new Harbour[2];
        h[0] = H1;
        h[1] = H2;
        
        Ship[] s = new Ship[1];
        s[0] = S1;
        
        Container[] c = new Container[2];
        c[0] = C1;
        c[1] = C2;
        
        ItemLiquid[] IL = new ItemLiquid[1];
        IL[0] = IL1;
        
        ItemSolid[] IS = new ItemSolid[1];
        IS[0] = IS1;
        
        Transaction[] t = new Transaction[1];
        t[0] = T1;
        
        admin1.editHarbour(h[0], "harbour edit", "ciremai");
        admin1.getHarbour(h);
        System.out.println();
        
        admin1.getShip(s);
        admin1.editShip(s[0], "name edit", "number edit", "2021-09-19 15:32:30" );
        admin1.getShip(s);
        System.out.println();
        
        admin1.getAllContainer(c);
        System.out.println();
        
        admin1.getAllTransaction(t);
        System.out.println();
        
        Cust1.getCustomerTransaction();
        
        
        
//        Container C1 = new Container("1", "Type 1", "40 x 20 x 20");
//        Container C2 = new Container("2", "Type 2", "60 x 30 x 30");
//        
//        ItemLiquid L1 = new ItemLiquid(1, "Liquid 1", 5, 200, true);    
//        ItemSolid IS1 = new ItemSolid(2, "Solid 1", 3, "Kotak" , 5);
//        
//        ItemLiquid L2 = new ItemLiquid(3, "Liquid 2", 5, 400, false);    
//        ItemSolid IS2 = new ItemSolid(4, "Solid 2", 3, "Persegi Panjang" , 1);
//        
//        Transaction T1 = new Transaction(1, 50000, "26-10-2021");
//        Transaction T2 = new Transaction(2, 75000, "1-11-2021");
//        
//        Customer Cust1 = new Customer("Customer 1", "08212121", "Pangkal Pinang");
//        Customer Cust2 = new Customer("Customer 2", "08131313", "Medan");
        
//        admin1.getHarbour(H1);
        
//        S1.setArrivalTime("2021-09-19 15:32:30");
//        
//        L1.setArrivalTime("2021-09-21 16:32:30");
//        IS1.setArrivalTime("2021-09-21 17:32:30");
//        
//        L2.setArrivalTime("2021-09-21 16:32:30");
//        IS2.setArrivalTime("2021-09-21 17:32:30");
//        
//        T1.addItemLiquid(L1);
//        T1.addItemSolid(IS1);
//        
//        T2.addItemLiquid(L2);
//        T2.addItemSolid(IS2);
//        
//        Cust1.addTransaction(T1);
//        Cust1.showAllTransaction();
//        System.out.println();
//        
//        Cust2.addTransaction(T2);
//        Cust2.showAllTransaction();
//        System.out.println();
//        
//        
//        System.out.println();
//        System.out.println();
//        
//        C1.addItemLiquid(L1);
//        C1.addItemSolid(IS1);
//        C2.addItemLiquid(L1);
//        C2.addItemSolid(IS1);
//        
//        S1.addContainer(C1);
//        S1.addContainer(C2);
//
//        S1.getAllContainer();
    }
    
}
