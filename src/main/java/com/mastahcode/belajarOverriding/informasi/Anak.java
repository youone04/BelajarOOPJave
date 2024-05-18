/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.belajarOverriding.informasi;

/**
 *
 * @author user
 */
public class Anak extends Keluarga {
//    overiding, maka valuenya tidak mengikuti value parent
    public void alamat(){
        System.out.println("Alamat anak : Jakarta");
    }
    
//    jika ingin tetap mengambil value orang tua setelah di overiding
//     pake keyword super
    
   public void tampilkanAlamat(){
       super.alamat();
   }
    
}
