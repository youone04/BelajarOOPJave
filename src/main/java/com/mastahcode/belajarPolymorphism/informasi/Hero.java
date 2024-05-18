/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.belajarPolymorphism.informasi;

/**
 *
 * @author user
 */
public class Hero {
    String nama;
    
//    constructor
    public Hero(String nama){
        this.nama = nama;
    }
    
    public void display(){
        System.out.println("\nNama \t: " + this.nama);
    }
    
    public void attack (Hero enemy){
        System.out.println("Menyerang");
    }
}
