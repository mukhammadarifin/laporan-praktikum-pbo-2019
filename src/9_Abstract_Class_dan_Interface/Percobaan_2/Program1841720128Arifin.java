/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.AbstractClass_dan_Interface.Percobaan2;

/**
 *
 * @author MuFin
 */
public class Program1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rektor1841720128Arifin pakRektor = new Rektor1841720128Arifin();
        
        Mahasiswa1841720128Arifin mahasiswaBiasa = new Mahasiswa1841720128Arifin("Charlie");
        Sarjana1841720128Arifin sarjanaCumlaude = new Sarjana1841720128Arifin("Dini");
        PascaSarjana1841720128Arifin masterCumlaude = new PascaSarjana1841720128Arifin("Elok");
        
        
        //pakRektor.beriSertifikatCumlaudeArifin(mahasiswaBiasa);
        pakRektor.beriSertifikatCumlaudeArifin(sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaudeArifin(masterCumlaude);
    }  
}
