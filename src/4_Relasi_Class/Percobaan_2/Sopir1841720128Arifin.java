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
public class Sopir1841720128Arifin {
    private String nama;
    private int biaya;

    public Sopir1841720128Arifin() {
    }

    public String getNamaArifin() {
        return nama;
    }

    public int getBiayaArifin() {
        return biaya;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setBiayaArifin(int biaya) {
        this.biaya = biaya;
    }
    
    public int hitungBiayaSopirArifin(int hari){
        return biaya * hari;
    }
}
