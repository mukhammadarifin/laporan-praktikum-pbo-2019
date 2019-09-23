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
public class Mobil1841720128Arifin {
    private String merk;
    private int biaya;

    public Mobil1841720128Arifin() {
    }

    public String getMerkArifin() {
        return merk;
    }

    public int getBiayaArifin() {
        return biaya;
    }

    public void setMerkArifin(String merk) {
        this.merk = merk;
    }

    public void setBiayaArifin(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaMobilArifin(int hari){
        return biaya * hari;
    }
}
