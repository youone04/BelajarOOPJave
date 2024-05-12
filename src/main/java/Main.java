/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
//https://www.youtube.com/watch?v=Pe0qqc-xt2Y&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=3
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil objekMobil = new Mobil();
        objekMobil.merk = "Civic";
        objekMobil.jalan();
        objekMobil.jalan();
        System.out.println("jarak tempuh "+objekMobil.jarakTempuh());
        System.out.println("waktu tempuh "+objekMobil.waktuTempuh());


    }
    
    
}
