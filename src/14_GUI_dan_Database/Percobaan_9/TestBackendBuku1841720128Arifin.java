/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Buku1841720128Arifin;
import backend.Kategori1841720128Arifin;

/**
 *
 * @author MuFin
 */
public class TestBackendBuku1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kategori1841720128Arifin novel = new Kategori1841720128Arifin().getByIdArifin(10);
        Kategori1841720128Arifin referensi = new Kategori1841720128Arifin().getByIdArifin(7);
        
        Buku1841720128Arifin buku1 = new Buku1841720128Arifin(novel, "Timun Mas", "Elex Media", "Bang Supit");
        Buku1841720128Arifin buku2 = new Buku1841720128Arifin(referensi, "Metode Linier", "Springer", "Alex Baldwin");
        Buku1841720128Arifin buku3 = new Buku1841720128Arifin(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        buku1.saveArifin();
        buku2.saveArifin();
       
        buku2.setJudulArifin("Aljabar Linier");
        buku2.saveArifin();
      
        buku3.deleteArifin();
        
        for(Buku1841720128Arifin b : new Buku1841720128Arifin().getAllArifin()){
            System.out.println("Kategori: " + b.getKategoriArifin().getNamaArifin() + ", Judul: " + b.getJudulArifin());
        }
        // test search
        for(Buku1841720128Arifin b : new Buku1841720128Arifin().searchArifin("timun")){
            System.out.println("Kategori: " + b.getKategoriArifin().getNamaArifin() + ", Judul: " + b.getJudulArifin());
        }
    }
    
}
