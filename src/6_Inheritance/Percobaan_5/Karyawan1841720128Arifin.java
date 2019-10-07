/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.percobaan5;

/**
 *
 * @author MuFin
 */
public class Karyawan1841720128Arifin {
    public String nama, alamat, jk;
    public int umur, gaji;
    
    public Karyawan1841720128Arifin(){
        
    }

    public Karyawan1841720128Arifin(String nama, String alamat, String jk, int umur, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawanArifin(){
        System.out.println("Nama            = "+nama);
        System.out.println("Alamat          = "+alamat);
        System.out.println("Jenis Kelamin   = "+jk);
        System.out.println("Umur            = "+umur);
        System.out.println("Gaji            = "+gaji);       
    }
}
