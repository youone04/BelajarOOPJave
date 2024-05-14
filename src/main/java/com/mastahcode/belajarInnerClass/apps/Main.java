/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.belajarInnerClass.apps;
import com.mastahcode.belajarInnerClass.informasi.Perkuliahan;
import com.mastahcode.belajarInnerClass.informasi.Perkuliahan.Dosen;

/**
 *
 * @author user
 */
//inner class merupakan class dalam class
//https://www.youtube.com/watch?v=j8fPmUlMxyE&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=15
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        pemanggilan child class dalam inner class
        
        Perkuliahan ObjekPerkuliahan = new Perkuliahan();
        Dosen ObjekDosen = ObjekPerkuliahan.new Dosen();
        ObjekDosen.setNama("Yudi Gunawan");
        System.out.println("Nama Dosen :"+ ObjekDosen.getNama());

    }
    
}
