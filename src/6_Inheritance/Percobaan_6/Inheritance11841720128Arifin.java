/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.percobaan6;

/**
 *
 * @author MuFin
 */
public class Inheritance11841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StaffTetap1841720128Arifin ST = new StaffTetap1841720128Arifin("2A", 100000, 200000, 250000, "Budi", "Malang", "Laki-laki", 20, 2000000);
        ST.tampilStaffTetapArifin();
        
        StaffHarian1841720128Arifin SH = new StaffHarian1841720128Arifin(100, 100000, 50000, "Budi", "Malang", "Laki-laki", 20, 2000000);
        SH.tampilStaffHarianArifin();
    }
}
