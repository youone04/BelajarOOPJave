/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.aplikasi;
import com.mastahcode.informasi.Mahasiswa;

/**
 *
 * @author user
 */
//hak akses
//class , variable, method dapat dikasih hak akses
//
//1. tanpa hak akses (default)
//hanya dapat diakses oleh package dan class sendiri
//2. private
//hanya dapat diakases dikelas sendiri
//3. public
//dapat diakses semua kelas
//4. protected
//dapat diakses dalam satu package dan sub class (class turunan)

//https://www.youtube.com/watch?v=pCvzZ6OmMEY&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=10
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa ObjekMahasiswa = new Mahasiswa();
        ObjekMahasiswa.dataDiri();
        ObjekMahasiswa.setAlamat("jakarta");
        System.out.println("alamat "+ObjekMahasiswa.getAlamat());
    }
    
}
