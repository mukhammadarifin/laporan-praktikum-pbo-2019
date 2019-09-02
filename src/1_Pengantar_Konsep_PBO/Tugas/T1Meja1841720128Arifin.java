/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author MuFin
 */
public class T1Meja1841720128Arifin {
    private String merek;
    private int panjang;
    private int tinggi;
    private int lebar;
    
    public void sM(String setMerek){
        merek = setMerek;
    }
    
    public void sP(int setPanjang){
        panjang = setPanjang;
    }
    
    public void sT(int setTinggi){
        tinggi = setTinggi;
    }
    
    public void sL(int setLebar){
        lebar = setLebar;
    }
    
    public void cetakSatus() {
        System.out.println("Merk: "+merek);
        System.out.println("Panjang: "+panjang);
        System.out.println("Lebar: "+lebar);
        System.out.println("Tinggi: "+tinggi);
    }
}
