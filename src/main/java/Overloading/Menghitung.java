/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Overloading;

/**
 *
 * @author user
 */
//overloading adala membuat nama method yang sama, tapi dengan 
//jumlah parameter berbeda, type variable berbeda
//atau nama parameter yang berbeda,
//intinya method tidak boleh sama persis
public class Menghitung {
    double penjumlahan(double angka1 , double angka2){
        double hasil = angka1 + angka2;
        return hasil;
    }
    
    double penjumlahan(int angka1 , int angka2){
        double hasil = angka1 + angka2;
        return hasil;
    }
    double penjumlahan(int angka1 , int angka2, int angak3){
        double hasil = angka1 + angka2;
        return hasil;
    }
    int penjumlahan(){
        return 0;
    }
}
