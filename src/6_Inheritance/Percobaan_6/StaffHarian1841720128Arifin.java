/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.percobaan6;

import Arifin.inheritance.percobaan5.Staff1841720128Arifin;

/**
 *
 * @author MuFin
 */
public class StaffHarian1841720128Arifin extends Staff1841720128Arifin{
    public int jmlJamKerja;

    public StaffHarian1841720128Arifin() {
        
    }

    public StaffHarian1841720128Arifin(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarianArifin(){
        System.out.println("==============Data Staff Harian===========");
        super.tampilDataStaffArifin();
        System.out.println("Jumlah Jam Kerja     = "+jmlJamKerja);
        System.out.println("Gaji Bersih          = "+(gaji+lembur-potongan));
    }
}
