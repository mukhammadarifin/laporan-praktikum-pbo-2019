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
public class PascaSarjana1841720128Arifin extends Mahasiswa1841720128Arifin implements Icumlaude1841720128Arifin, Iberprestasi1841720128Arifin{
    
    public PascaSarjana1841720128Arifin(String nama) {
        super(nama);
    }

    @Override
    public void lulusArifin() {
        kuliahDiKampusArifin();
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTinggiArifin() {
        System.out.println("IPK-ku lebih dari 3,71");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya telah menjuarai kompetisi INTERNASIONAL");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya menerbitkan artikel di juarnal INTERNASIONAL");
    }  
}
