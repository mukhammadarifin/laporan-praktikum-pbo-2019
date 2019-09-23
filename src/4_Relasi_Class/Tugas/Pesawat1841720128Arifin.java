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
public class Pesawat1841720128Arifin {
    private String kode;
    private String nama;
    private Kursi1841720128Arifin[] arrayKursi;
    private Pegawai1841720128Arifin pilot;
    private Pegawai1841720128Arifin pramugari;

    Pesawat1841720128Arifin(String a, int i, Pegawai1841720128Arifin masinis, Pegawai1841720128Arifin asisten) {
    }
    
    private void initKursiArifin(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720128Arifin(String.valueOf(i + 1));
        }
    }
    
    public Pesawat1841720128Arifin(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720128Arifin[jumlah];
        this.initKursiArifin();
    }
    
    public Pesawat1841720128Arifin(String nama, Pegawai1841720128Arifin pilot, Pegawai1841720128Arifin pramugari){
        this.nama = nama;
        this.pilot = pilot;
        this.pramugari = pramugari;
    }

    public void setPramugariArifin(Pegawai1841720128Arifin pramugari) {
        this.pramugari = pramugari;
    }
    
    public String infoArifin(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720128Arifin kursi : arrayKursi){
            info += kursi.infoArifin();
        }
        return info;
    }
    
    public String infoArifin1(){
        String info1 = "";
        info1 += "Pilot: " + this.pilot.infoArifin1();
        info1 += "Pramugari: " + this.pramugari.infoArifin1();
        return info1;
    }

    public void setPenumpangArifin(Penumpang1841720128Arifin penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangArifin(penumpang);
    }
    
    public void setPegawaiArifin(Pegawai1841720128Arifin pilot, Pegawai1841720128Arifin pramugari){
        this.pilot = pilot;
        this.pramugari = pramugari;
    }
            
}