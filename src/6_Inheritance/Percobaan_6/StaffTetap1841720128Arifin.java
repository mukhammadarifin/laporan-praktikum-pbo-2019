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
public class StaffTetap1841720128Arifin extends Staff1841720128Arifin{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720128Arifin() {
        
    }

    public StaffTetap1841720128Arifin(String golongan, int asuransi, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
 
    public void tampilStaffTetapArifin(){
        System.out.println("==============Data Staff Tetap===========");
        super.tampilDataStaffArifin();
        System.out.println("Golongan            = "+golongan);
        System.out.println("Jumlah Asuransi     = "+asuransi);
        System.out.println("Gaji Bersih         = "+(gaji+lembur-potongan-asuransi));
    }
}