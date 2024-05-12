/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.belajarStatic.data;

/**
 *
 * @author user
 */
public class Users {
    String nama = "Yudi Gunawan";
    String Nik;
    static int umur = 20;
    
//    tanpa static
    public void cetakNama(){
        System.out.println("Nama: "+ nama);
    }
    
//    dengan static
   public static int umur(){
        int hasilUmur = umur;
        return hasilUmur;
    }
}
