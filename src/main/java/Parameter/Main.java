/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parameter;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User ObjekUser = new User();
        System.out.println("cek ideal "+ ObjekUser.cekIdeal(180 , 60));
        ObjekUser.umur(24);
    }
    
}
