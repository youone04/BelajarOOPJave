/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.belajarPolymorphism.apps;
import com.mastahcode.belajarPolymorphism.informasi.Hero;
import com.mastahcode.belajarPolymorphism.informasi.HeroIntel;
import com.mastahcode.belajarPolymorphism.informasi.HeroStrength;
import com.mastahcode.belajarPolymorphism.informasi.HerpAgility;


/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=hvrS5b0k4Jk
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero hero1 = new Hero("Ucup");
        HeroStrength hero2  = new HeroStrength("otong");
        hero1.display();
        hero2.display();
        
//        Polymorphic
//        depan parent dan belakang objeknya
        Hero hero3 = new HeroStrength("maria");
        hero3.display();
        
        HerpAgility hero4 = new HerpAgility("Iron");
        hero4.display();
        hero4.showOff();// ini bisa karen typenya HerpAgility yang mempunyai method showOff
        
        Hero hero5 = new HerpAgility("Spider");
        hero5.display();
        
        System.out.println("===============");
        
        //array list
        Hero[] kumpulanHero = new Hero[5];
        kumpulanHero[0] = hero1;
        kumpulanHero[1] = hero2;
        kumpulanHero[2] = hero3;
        kumpulanHero[3] = hero4;
        kumpulanHero[4] = hero5;
        
        kumpulanHero[0].display();
        kumpulanHero[1].display();
        kumpulanHero[2].display();
        kumpulanHero[3].display();
        kumpulanHero[4].display();
        
        //method calls
//        kumpulanHero[3].shoOff; tidak bisa karena tipe nya yaitu hero dam hero tidak memliliki method showOff
        
        //aplikasi
        System.out.println("================");
        hero1.attack(hero5);
        hero1.attack(hero2);
        
    }
    
}
