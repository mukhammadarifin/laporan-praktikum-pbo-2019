/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.tugasno2;

/**
 *
 * @author MuFin
 */
public class MainManusia1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia1841720128Arifin manusia = new Manusia1841720128Arifin();
        Dosen1841720128Arifin dosen = new Dosen1841720128Arifin();
        Mahasiswa1841720128Arifin mahasiswa = new Mahasiswa1841720128Arifin();
        
        mahasiswa.makanArifin();
        mahasiswa.tidurArifin();
        dosen.makanArifin();
        dosen.lemburArifin();
        manusia.makanArifin();
        manusia = dosen;
        manusia.makanArifin();
        manusia.bernafasArifin();
        manusia = mahasiswa;
        manusia.makanArifin();
        manusia.bernafasArifin();
        
        
    }
    
}
