/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.percobaan5;

/**
 *
 * @author MuFin
 */
public class Inheritance11841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Manager1841720128Arifin M = new Manager1841720128Arifin();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManagerArifin();
        
        Staff1841720128Arifin S = new Staff1841720128Arifin();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaffArifin();
    }
    
}
