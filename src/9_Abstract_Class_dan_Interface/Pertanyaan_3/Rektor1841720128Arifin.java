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
public class Rektor1841720128Arifin {
    public void beriSertifikatCumlaudeArifin(Icumlaude1841720128Arifin mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat cumlaude");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");
        
        mahasiswa.lulusArifin();
        mahasiswa.meraihIPKTinggiArifin();
        
        System.out.println("-------------------------------------------");
    }
    
    public void beriSertifikatMawapres(Iberprestasi1841720128Arifin mahasiswa){
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();
        
        System.out.println("--------------------------------------------");
    }
}
