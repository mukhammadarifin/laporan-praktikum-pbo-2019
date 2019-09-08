/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author MuFin
 */
public class T4Barang1841720128Arifin {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJualArifin(){
        int hargaJual=(int) (hargaDasar-(diskon*(hargaDasar/100)));
        
        return hargaJual;
    }
    
    public void tampilDataArifin(){
        System.out.println("Kode Barang : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp."+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("harga Jual : "+hitungHargaJualArifin());
    }
}
