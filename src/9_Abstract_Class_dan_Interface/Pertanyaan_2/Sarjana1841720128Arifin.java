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
public class Sarjana1841720128Arifin extends Mahasiswa1841720128Arifin implements Icumlaude1841720128Arifin{
    
    public Sarjana1841720128Arifin(String nama) {
        super(nama);
    }

    @Override
    public void lulusArifin() {
        kuliahDiKampus();
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }

    @Override
    public void meraihIPKTinggiArifin() {
        System.out.println("IPK-ku lebih dari 3,51");
    }
    
    
}
