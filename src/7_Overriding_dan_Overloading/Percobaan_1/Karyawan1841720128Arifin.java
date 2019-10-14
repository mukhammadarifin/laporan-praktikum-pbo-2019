/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.percobaan1;

/**
 *
 * @author MuFin
 */
public class Karyawan1841720128Arifin {
    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setNipArifin(String nip) {
        this.nip = nip;
    }

    public void setGolonganArifin(String golongan) {
        this.golongan = golongan;
        
        switch(golongan.charAt(0)){
            case '1': this.gaji=5000000;
                break;
            case '2': this.gaji=3000000;
                break;
            case '3': this.gaji=2000000;
                break;
            case '4': this.gaji=1000000;
                break;
            case '5': this.gaji=750000;
                break;
        }
    }

    public void setGajiArifin(double gaji) {
        this.gaji = gaji;
    }

    public String getNamaArifin() {
        return nama;
    }

    public String getNipArifin() {
        return nip;
    }

    public String getGolonganArifin() {
        return golongan;
    }

    public double getGajiArifin() {
        return gaji;
    }   
}
