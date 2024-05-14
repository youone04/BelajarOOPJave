/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.encapsulotion.apps;
import com.mastahcode.encapsulotion.data.Mahasiswa;
/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=RbnhthiNrKg&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=12
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa objekMahasiswa = new Mahasiswa();
        objekMahasiswa.setNama("Yudi Gunawan");
        objekMahasiswa.setUmur(0);
        System.out.println("nama: "+ objekMahasiswa.getNama());
        System.out.println("umur: "+ objekMahasiswa.getUmur());
        
    }
    
}
