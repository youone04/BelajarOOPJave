/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.informasi;

/**
 *
 * @author user
 */
public class Mahasiswa {
   public String nama = "No";
   private String alamat = "No";
   protected String Nik = "No";
    
    public void dataDiri(){
        System.out.println("Nama "+ nama);
        System.out.println("Alamat "+ alamat);
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
}
