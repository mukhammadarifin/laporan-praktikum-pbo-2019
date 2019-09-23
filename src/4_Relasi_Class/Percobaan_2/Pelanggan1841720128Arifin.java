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
public class Pelanggan1841720128Arifin {
    private String nama;
    private Mobil1841720128Arifin mobil;
    private Sopir1841720128Arifin sopir;
    private int hari;

    public Pelanggan1841720128Arifin() {
    }

    public String getNamaArifin() {
        return nama;
    }

    public Mobil1841720128Arifin getMobilArifin() {
        return mobil;
    }

    public Sopir1841720128Arifin getSopirArifin() {
        return sopir;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setMobilArifin(Mobil1841720128Arifin mobil) {
        this.mobil = mobil;
    }

    public void setSopirArifin(Sopir1841720128Arifin sopir) {
        this.sopir = sopir;
    }

    public int getHariArifin() {
        return hari;
    }

    public void setHariArifin(int hari) {
        this.hari = hari;
    }
    
    public int hitungBiayaTotalArifin(){
        return mobil.hitungBiayaMobilArifin(hari) + sopir.hitungBiayaSopirArifin(hari);
    }
}
