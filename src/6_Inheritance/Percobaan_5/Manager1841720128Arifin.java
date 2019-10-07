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
public class Manager1841720128Arifin extends Karyawan1841720128Arifin{
    public int tunjangan;
    
    public Manager1841720128Arifin(){
        
    }
    
    public void tampilDataManagerArifin(){
        super.tampilDataKaryawanArifin();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("Total Gaji      = "+super.gaji+tunjangan);
    }
}
