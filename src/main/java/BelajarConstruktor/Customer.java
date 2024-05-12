/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarConstruktor;

/**
 *
 * @author user
 */
public class Customer {
    String nama;
    int umur;
    
     Customer(){
        this.nama = "Yayan";
        this.umur = 23;
         System.out.println("Construktor tanpa parameter");
    }
    
    Customer(String nama){
        this.nama = nama;
        System.out.println("nama "+ this.nama);

    }
    
    Customer(String nama , int umur){
        this.nama = nama;
        this.umur = umur;
        System.out.println("nama dan umur "+ this.nama +" and "+ this.umur);
    }
    
}
