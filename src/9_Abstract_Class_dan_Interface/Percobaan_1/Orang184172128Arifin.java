/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.AbstractClass_dan_Interface.Percobaan1;

/**
 *
 * @author MuFin
 */
public class Orang184172128Arifin {
    private String nama;
    private Hewan1841720128Arifin hewanPeliharaan;

    public Orang184172128Arifin(String nama) {
        this.nama = nama;
    }
    
    public void peliharaanHewanArifin(Hewan1841720128Arifin hewanPeliharaan){
        this.hewanPeliharaan = hewanPeliharaan;
    }
    
    public void ajakPeliharaanJalanJalanArifin(){
        System.out.println("Namaku " + this.nama);
        System.out.println("Hewan Peliharaanku berjalan dengan cara: ");
        this.hewanPeliharaan.bergerak();
        System.out.println("-----------------------------------------");
    }
}
