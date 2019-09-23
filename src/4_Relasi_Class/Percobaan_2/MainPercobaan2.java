/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan2;

/**
 *
 * @author MuFin
 */
public class MainPercobaan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil1841720128Arifin m = new Mobil1841720128Arifin();
        m.setMerkArifin("Avanza");
        m.setBiayaArifin(350000);
        Sopir1841720128Arifin s = new Sopir1841720128Arifin();
        s.setNamaArifin("John Doe");
        s.setBiayaArifin(200000);
        Pelanggan1841720128Arifin p = new Pelanggan1841720128Arifin();
        p.setNamaArifin("Jane Doe");
        p.setMobilArifin(m);
        p.setSopirArifin(s);
        p.setHariArifin(2);
        System.out.println("Biaya Total: " + p.hitungBiayaTotalArifin());
    }
    
}
