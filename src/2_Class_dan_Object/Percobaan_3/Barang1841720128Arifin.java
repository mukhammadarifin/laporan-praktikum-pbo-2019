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
public class Barang1841720128Arifin {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangArifin(){
        System.out.println("Nama Barang : "+namaBrg);
        System.out.println("Jenis Barang : "+jenisBrg);
        System.out.println("Stok : "+stok);
    }
    
    //method dengan argumen dan nilai baik (return)
    public int tambahStokArifin(int brgMasuk){
        int stokBaru = brgMasuk+stok;
        return stokBaru;
    }
}
