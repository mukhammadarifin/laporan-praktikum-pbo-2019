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
public class SepedaGunung1841720128Arifin extends Sepeda1841720128Arifin {
    private String tipeSuspensi;
    
    public void setTipeSuspensiArifin(String newValue) {
        tipeSuspensi = newValue;
    }
    
    public void cetakSatusArifin() {
        super.cetakSatusArifin();
        System.out.println("Tipe Suspensi: "+tipeSuspensi);
    }
}
