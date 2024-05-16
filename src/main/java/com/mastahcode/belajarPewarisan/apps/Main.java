/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.belajarPewarisan.apps;
import com.mastahcode.belajarPewarisan.informasi.Anak;
import com.mastahcode.belajarPewarisan.informasi.Keluarga;


/**
 *
 * @author user
 */
//beberapa yang dapat di wariskan adalah attribute dan method
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anak ObjekAnak = new Anak();
        ObjekAnak.setAlamat("Alamat");
        System.out.println("alamt "+ObjekAnak.getAlamat());
                      
    }
    
}
