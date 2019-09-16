/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author MuFin
 */
public class T4Anggota1841720128Arifin {
    private int nomorKtp;
    private String nama;
    private int pinjaman;
    
    T4Anggota1841720128Arifin(int nomorKtp, String nama, int pinjaman){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.pinjaman = pinjaman;
    }
    
    public void setNamaArifin(String nama){
        this.nama = nama;
    }
    public void setKtpArifin(int nomorKtp){
        this.nomorKtp = nomorKtp;
    }
    public String getNamaArifin(){
        return nama;
    }
    public int getNomorKtpArifin(){
        return nomorKtp;
    }
    public int getLimitPinjamanArifin(){
        return pinjaman;
    }
    public int getJumlahPinjamArifin(){ 
        return pinjaman;
    }
    public void pinjamArifin(int pinjaman){
        if(pinjaman > 5000000){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        }
        else{
            this.pinjaman = pinjaman;
        }
    }
    public void angsurArifin(int uang){
        int limit = pinjaman*10/100;
        if(uang == limit){
            pinjaman -=uang;
        }
        else{
           System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman"); 
        }    
    }
}
