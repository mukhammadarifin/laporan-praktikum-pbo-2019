/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;
import java.util.Scanner;
/**
 *
 * @author MuFin
 */
public class T4TestKoperasi1841720128Arifin {

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        int pilihan;
        int nomorKtp;
        String nama;
        int pinjaman;
        int uang;
        
        System.out.print("Nomor KTP: ");
        nomorKtp = scInt.nextInt();
        
        System.out.print("Nama: ");
        nama = scString.nextLine();
        
        System.out.print("Pinjaman: ");
        pinjaman = scInt.nextInt();
        
        T4Anggota1841720128Arifin donny = new T4Anggota1841720128Arifin(nomorKtp, nama, pinjaman);
        do{
            System.out.println("1. Angsur");
            System.out.println("2. Lihat Jumlah Pinjaman");
            System.out.println("3. Tampilkan");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scInt.nextInt();
            switch(pilihan){                    
                case 1:
                    System.out.print("Masukkan angsuran: ");
                    uang = scInt.nextInt();
                    donny.angsurArifin(uang);
                    break;
                
                case 2:
                    System.out.println("Sisa Pinjaman: "+donny.getJumlahPinjamArifin());
                    break;
                    
                case 3:
                    System.out.println("Nama: "+donny.getNamaArifin());
                    System.out.println("Nomor KTP: "+donny.getNomorKtpArifin());
                    System.out.println("Limit Pinjaman: "+donny.getLimitPinjamanArifin());
                    System.out.println("Sisa Pinjaman: "+donny.getJumlahPinjamArifin());  
            }   
        }
        while(pilihan!=4);
    }
}
