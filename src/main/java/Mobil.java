/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Mobil { //class
    //atribute
    String merk = "Inova";
    String warna = "Hijau";
    int harga = 1000;
    final int tahun = 2016; //final => constanta (tidak dapat diubah nilainya)
    
    //contructor
    public Mobil(){
        this.harga = 2334;
    }
    
    //method prosedure
    void jalan(){
        System.out.println("merk mobil "+ merk);
        System.out.println("mobil melaju dengan kecepetan 40KM/Jam");
        System.out.println("warna mobil adalah " + warna );
        System.out.println("harga mobil :"+harga);
        System.out.println("tahun pembuatan mobil "+ tahun);
    }
    
    double jarak = 90;
    double kecepatan = 60;
    double waktuTempuh = 1;
    
//    method fungtion
    double jarakTempuh(){
        double itungJarak = kecepatan * waktuTempuh;
        return itungJarak;
    }
    
//    method fungtion
    double waktuTempuh(){
        double itungWaktu = jarak/kecepatan;
        return itungWaktu;
    }
}
