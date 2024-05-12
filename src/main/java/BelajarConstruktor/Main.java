/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BelajarConstruktor;

/**
 *
 * @author user
 */
//cunstruktor adalah fitur pada oop yang dijalankan terlebih dahulu
//dan dapat di overloading
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Customer ObjekCustomer1 = new Customer();
        Customer ObjekCustomer2 = new Customer("yudi gunawan");
        Customer ObjekCustomer3 = new Customer("yudi gunawan", 25);
    }
    
}
