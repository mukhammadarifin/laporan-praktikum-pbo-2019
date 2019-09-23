/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan4;

/**
 *
 * @author MuFin
 */
public class MainPercobaan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Penumpang1841720128Arifin p = new Penumpang1841720128Arifin("12345", "Mr. Krab");
        Gerbong1841720128Arifin gerbong = new Gerbong1841720128Arifin("A", 10);
        gerbong.setPenumpangArifin(p, 1);
        System.out.println(gerbong.infoArifin());
    }
    
}
