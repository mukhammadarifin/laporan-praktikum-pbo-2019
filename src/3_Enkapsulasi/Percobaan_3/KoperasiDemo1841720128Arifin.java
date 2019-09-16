/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author MuFin
 */
public class KoperasiDemo1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Anggota1841720128Arifin anggota1 = new Anggota1841720128Arifin();
       anggota1.setNamaArifin("Iwan Setiawan");
       anggota1.setAlamatArifin("Jalan Sukarno Hatta no 10");
       anggota1.setorArifin(100000);
       System.out.println("Simpanan " + anggota1.getNamaArifin() + " : Rp " + anggota1.getSimpananArifin());
       
       anggota1.pinjamArifin(5000);
       System.out.println("Simpanan " + anggota1.getNamaArifin() + " : Rp " + anggota1.getSimpananArifin());
    }
    
}
