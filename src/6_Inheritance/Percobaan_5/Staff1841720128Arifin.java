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
public class Staff1841720128Arifin extends Karyawan1841720128Arifin{
    public int lembur, potongan;

    public Staff1841720128Arifin() {
        
    }

    public Staff1841720128Arifin(int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffArifin(){
        super.tampilDataKaryawanArifin();
        System.out.println("Lembur          = "+lembur);
        System.out.println("Potongan        = "+potongan);
        System.out.println("Total Gaji      = "+(gaji+lembur-potongan));
    }
}
