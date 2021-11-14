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
        
    }
    
}
