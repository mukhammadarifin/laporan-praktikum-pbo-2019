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
public class TestBarang1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barang1841720128Arifin brg1 = new Barang1841720128Arifin();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangArifin();
        // menampilkan dan mengisi argumen untuk mwnambahkan stok barang
        System.out.println("Stok Baru adalah : "+brg1.tambahStokArifin(20));
    }
    
}
