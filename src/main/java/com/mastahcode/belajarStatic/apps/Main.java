/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mastahcode.belajarStatic.apps;
import com.mastahcode.belajarStatic.data.Users;

/**
 *
 * @author user
 */
//keyword static dapat digunakan untuk atribut (variable), method dan nested class
//atribut(variable), method dan nested class yang diberi keyword static langsung dapat di panggil
//tanpa membuat objeknya
//attribut(variabel), method dan nested class yang diberikan keyword static, maka
//tidak akan dapata mengakses data pada class tersebut secara langsung. data yang akan kita ambil
//juga harus diubah menjadi static agar dapat mengakses data tersebut

//https://www.youtube.com/watch?v=PZI5Z8Gqxbw&list=PLFfUPa9IV8LpbRH5-TzphcZj6tpoxdr-p&index=11
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        tanpa static
        Users ObjekUsers = new Users();
        ObjekUsers.cetakNama();
        
//        dengan static
        System.out.println("Umur: "+ Users.umur());
        
    }
    
}
