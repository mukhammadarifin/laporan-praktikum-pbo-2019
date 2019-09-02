/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author MuFin
 */
public class SepedaDemo1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Pembuatan dua buah Object sepeda
        Sepeda1841720128Arifin spd1 = new Sepeda1841720128Arifin();
        Sepeda1841720128Arifin spd2 = new Sepeda1841720128Arifin();
        SepedaGunung1841720128Arifin spd3 = new SepedaGunung1841720128Arifin();
        
        //Pemanggilan method didalam Object sepeda
        spd1.setMerekArifin("Polygon");
        spd1.tambahKecepatanArifin(10);
        spd1.gantiGearArifin(2);        
        spd1.tambahWarnaArifin("merah");
        spd1.cetakSatusArifin();
        
        spd2.setMerekArifin("Wiim Cycle");
        spd2.tambahKecepatanArifin(10);
        spd2.gantiGearArifin(2);
        spd2.tambahKecepatanArifin(10);
        spd2.gantiGearArifin(3);
        spd2.tambahWarnaArifin("biru");
        spd2.cetakSatusArifin();
        
        spd3.setMerekArifin("Klinee");
        spd3.tambahKecepatanArifin(5);
        spd3.gantiGearArifin(7);
        spd3.setTipeSuspensiArifin("Gas suspension");
        spd3.tambahWarnaArifin("hijau");
        spd3.cetakSatusArifin();


    }
    
}
