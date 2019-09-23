/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan3;

/**
 *
 * @author MuFin
 */
public class Pegawai1841720128Arifin {
    private String nip;
    private String nama;

    public Pegawai1841720128Arifin(String nip, String nama) {
        this.nip = nip;
        this.nama = nama;
    }

    public String getNipArifin() {
        return nip;
    }

    public String getNamaArifin() {
        return nama;
    }

    public void setNipArifin(String nip) {
        this.nip = nip;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }
    
    public String infoArifin(){
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }
}
