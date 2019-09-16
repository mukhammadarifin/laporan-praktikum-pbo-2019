/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author MuFin
 */
public class T4TestKoperasi1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        T4Anggota1841720128Arifin donny = new T4Anggota1841720128Arifin("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNamaArifin());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanArifin());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjamArifin(10000000);
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjamArifin(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamArifin());
        
        System.out.println("\nMembayar angsuran 1.000.000...");
        donny.angsurArifin(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamArifin());
        
        System.out.println("\nMembayar angsuran 3.000.000...");
        donny.angsurArifin(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamArifin());
    } 
}
