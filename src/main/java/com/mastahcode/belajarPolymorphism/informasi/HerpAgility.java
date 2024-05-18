/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.belajarPolymorphism.informasi;

/**
 *
 * @author user
 */
public class HerpAgility extends Hero{
     String type = "Agility";
    
    public HerpAgility(String nama){
//        agar nilainya mengambil punya parent
        super(nama);
    }
    
    //    override method display pada parrent
    @Override
    public void display(){
//     pake super agar, valuenya tetep sama dengan parent
     super.display();
     System.out.println("Type \t: " + this.type);

    }
    
    public void showOff(){
        System.out.println("Saya Hero Agility");
    }
}
