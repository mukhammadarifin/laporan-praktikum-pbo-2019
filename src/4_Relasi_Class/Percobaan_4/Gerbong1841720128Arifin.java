/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan4;

/**
 *
 * @author MuFin
 */
public class Gerbong1841720128Arifin {
    private String kode;
    private Kursi1841720128Arifin[] arrayKursi;
    
    private void initKursiArifin(){
        for(int i = 0; i < arrayKursi.length; i++){
            this.arrayKursi[i] = new Kursi1841720128Arifin(String.valueOf(i + 1));
        }
    }
    
    public Gerbong1841720128Arifin(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi1841720128Arifin[jumlah];
        this.initKursiArifin();
    }
    
    public String infoArifin(){
        String info = "";    
        info += "Kode: " + kode + "\n";
        for(Kursi1841720128Arifin kursi : arrayKursi){
            info += kursi.infoArifin();
        }    
        return info;
    }
    
    public void setPenumpangArifin(Penumpang1841720128Arifin penumpang, int nomor){
        this.arrayKursi[nomor - 1].setPenumpangArifin(penumpang);
    }
}
