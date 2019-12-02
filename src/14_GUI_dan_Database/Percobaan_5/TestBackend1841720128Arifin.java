/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;

/**
 *
 * @author MuFin
 */
public class TestBackend1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Kategori1841720128Arifin kat1 = new Kategori1841720128Arifin("Novel", "Koleksi buku novel");
        Kategori1841720128Arifin kat2 = new Kategori1841720128Arifin("Referensi", "Buku referensi ilmiah");
        Kategori1841720128Arifin kat3 = new Kategori1841720128Arifin("Komik", "Komik anak-anak");

        // test insert
        kat1.saveArifin();
        kat2.saveArifin();
        kat3.saveArifin();

        // test update
        kat2.setKeteranganArifin("Koleksi buku referensi ilmiah");
        kat2.saveArifin();

        // test delete
        kat3.deleteArifin();

        // test select all
        for(Kategori1841720128Arifin k : new Kategori1841720128Arifin().getAllArifin()){
            System.out.println("Nama: " + k.getNamaArifin() + ", Ket: " + k.getKeteranganArifin());
        }

        // test search
        for(Kategori1841720128Arifin k : new Kategori1841720128Arifin().searchArifin("ilmiah")){
            System.out.println("Nama: " + k.getNamaArifin() + ", Ket: " + k.getKeteranganArifin());
        }
    }
    
}
