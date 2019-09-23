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
public class KeretaApi1841720128Arifin {
    private String nama;
    private String kelas;
    private Pegawai1841720128Arifin masinis;
    private Pegawai1841720128Arifin asisten;

    public KeretaApi1841720128Arifin(String nama, String kelas, Pegawai1841720128Arifin masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi1841720128Arifin(String nama, String kelas, Pegawai1841720128Arifin masinis, Pegawai1841720128Arifin asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public String getNamaArifin() {
        return nama;
    }

    public String getKelasArifin() {
        return kelas;
    }

    public Pegawai1841720128Arifin getMasinisArifin() {
        return masinis;
    }

    public Pegawai1841720128Arifin getAsistenArifin() {
        return asisten;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setKelasArifin(String kelas) {
        this.kelas = kelas;
    }

    public void setMasinisArifin(Pegawai1841720128Arifin masinis) {
        this.masinis = masinis;
    }

    public void setAsistenArifin(Pegawai1841720128Arifin asisten) {
        this.asisten = asisten;
    }
    
    public String infoArifin(){
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.infoArifin();
        info += "Asisten: " + this.asisten.infoArifin();
        return info;
    }
}
