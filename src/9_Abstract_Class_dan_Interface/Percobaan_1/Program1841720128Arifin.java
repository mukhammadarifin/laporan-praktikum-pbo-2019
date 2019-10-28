/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.AbstractClass_dan_Interface.Percobaan1;

/**
 *
 * @author MuFin
 */
public class Program1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kucing1841720128Arifin kucingKampung = new Kucing1841720128Arifin();
        Ikan1841720128Arifin lumbaLumba = new Ikan1841720128Arifin();
        
        Orang184172128Arifin ani = new Orang184172128Arifin("Ani");
        Orang184172128Arifin budi = new Orang184172128Arifin("Budi");
        
        ani.peliharaanHewanArifin(kucingKampung);
        budi.peliharaanHewanArifin(lumbaLumba);
        
        ani.ajakPeliharaanJalanJalanArifin();
        budi.ajakPeliharaanJalanJalanArifin();
    }
}
