/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mastahcode.encapsulotion.data;

/**
 *
 * @author user
 */
public class Mahasiswa {
    private String nama;
    private String Nik;
    private int umur;
    
//    enscapsulotion nama
    public void setNama(String nama){
        if(nama.isEmpty()){
            System.out.println("nama kosong");
        }
         this.nama = nama;
    }
    
    public String getNama(){
        if("".equals(this.nama)){
            System.out.println("Silahkan isi nama");
        }
        return this.nama;
    }
    
//    enscapsulotion Nik
    public void setNik(String Nik){
        this.Nik = Nik;
    }
    public String getNik(){
        return this.Nik;
    }
    
//    enscapsultion umur
    public void setUmur(int umur){
        if(umur >= 1 && umur <= 120){
              this.umur = umur;
        }else{
            System.out.println("Umur tidak valid");
        }
    }
    public int getUmur(){
        
        return this.umur;
    }
}
