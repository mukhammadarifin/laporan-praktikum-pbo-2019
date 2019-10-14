/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.tugasno1;

/**
 *
 * @author MuFin
 */
public class MainSegitiga1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segitiga1841720128Arifin segitiga = new Segitiga1841720128Arifin();
        
        segitiga.hasilArifin();
        System.out.println(segitiga.totalSudutArifin(2));
        segitiga.hasilArifin();
        System.out.println(segitiga.totalSudutArifin(2, 2));
        segitiga.hasilArifin();
        System.out.println(segitiga.kelilingArifin(4, 4));
        segitiga.hasilArifin();
        System.out.println(segitiga.kelilingArifin(2, 2, 2));
    }
    
}
