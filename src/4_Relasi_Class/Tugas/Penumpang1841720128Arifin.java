/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.tugas;

/**
 *
 * @author MuFin
 */
public class Penumpang1841720128Arifin {
    private String ktp;
    private String nama;

    public Penumpang1841720128Arifin(String ktp, String nama) {
        this.ktp = ktp;
        this.nama = nama;
    }

    public void setKtpArifin(String ktp) {
        this.ktp = ktp;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public String getKtpArifin() {
        return ktp;
    }

    public String getNamaArifin() {
        return nama;
    }
    
    public String infoArifin(){
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}
