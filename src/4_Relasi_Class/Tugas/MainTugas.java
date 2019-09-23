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
public class MainTugas {

    public static void main(String[] args) {
        Pegawai1841720128Arifin pilot = new Pegawai1841720128Arifin("1234", "Hashirama senju");
        Pegawai1841720128Arifin pramugari = new Pegawai1841720128Arifin("4567", "Tobirama senju");
        Pesawat1841720128Arifin pesawat = new Pesawat1841720128Arifin("A", 10);
        Penumpang1841720128Arifin p = new Penumpang1841720128Arifin("12345", "Mr. Krab");
        
        pesawat.setPegawaiArifin(pilot, pramugari);
        pesawat.setPenumpangArifin(p, 1);
        
        System.out.println(pesawat.infoArifin1());
        System.out.println(pesawat.infoArifin());
    }  
}