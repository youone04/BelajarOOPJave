/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.belajarKonvertPolymorphism.apps;

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=BeXHEcSNDxM&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=18
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kampus objekKampus = new Mahasiswa();
        
        //konversi class child, agar method child dapat dipanggil
        Mahasiswa objekMahasiswa = (Mahasiswa) objekKampus;
        objekMahasiswa.setNIM("001");
        objekMahasiswa.setNamaKampus("Itera");
       
        
        System.out.println("Nim \t: "+ objekMahasiswa.getNIM());
        System.out.println("Nama kampus \t: " + objekMahasiswa.getNamaKampus());
    }
    
}
