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
public class Customer {
    private String name, phone, address;
    private Transaction[] transaction = new Transaction[1];
    private int i;

    public Customer(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    
    public void editCustomer(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void addTransaction(Transaction T) {
        transaction[i++] = T;
    }
    
    public void getCustomer(){
        System.out.println("Name \t: " + this.getName());
        System.out.println("Phone \t: " + this.getPhone());
        System.out.println("Address : " + this.getAddress());
    }
    
    public void showAllTransaction(){
        getCustomer();
        for (int i=0;i<transaction.length;i++){
            System.out.println("Transaction ke-" + (i+1) + " : ");
            System.out.println("No \t\t: " + transaction[i].getTransactionID());
            System.out.println("Total Cost \t: " + transaction[i].getTotalCost());
            System.out.println("Total Weight \t: " + transaction[i].getTotalWeight());
            System.out.println("Item \t: "); 
            transaction[i].getAllItem();
        }
    }
    
    public void deleteTransaction(){
        this.transaction = null;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public Transaction[] getTransaction() {
        return transaction;
    }
    
    
}
