/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.percobaan1;

/**
 *
 * @author MuFin
 */
public class Utama1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");
        Manager1841720128Arifin man[] = new Manager1841720128Arifin[2];
        Staff1841720128Arifin staff1[] = new Staff1841720128Arifin[2];
        Staff1841720128Arifin staff2[] = new Staff1841720128Arifin[3];
        
        man[0] = new Manager1841720128Arifin();
        man[0].setNamaArifin("Tedjo");
        man[0].setNipArifin("101");
        man[0].setGolonganArifin("1");
        man[0].setTunjanganArifin(5000000);
        man[0].setBagianArifin("Administrasi");
        
        man[1] = new Manager1841720128Arifin();
        man[1].setNamaArifin("Atika");
        man[1].setNipArifin("102");
        man[1].setGolonganArifin("1");
        man[1].setTunjanganArifin(2500000);
        man[1].setBagianArifin("Pemasaran");
        
        staff1[0] = new Staff1841720128Arifin();
        staff1[0].setNamaArifin("Usman");
        staff1[0].setNipArifin("0003");
        staff1[0].setGolonganArifin("2");
        staff1[0].setLemburArifin(10);
        staff1[0].setGajiLemburArifin(10000);
        
        staff1[1] = new Staff1841720128Arifin();
        staff1[1].setNamaArifin("Anugrah");
        staff1[1].setNipArifin("0005");
        staff1[1].setGolonganArifin("2");
        staff1[1].setLemburArifin(10);
        staff1[1].setGajiLemburArifin(55000);
        man[0].setStaffArifin(staff1);
        
        staff2[0] = new Staff1841720128Arifin();
        staff2[0].setNamaArifin("Hendra");
        staff2[0].setNipArifin("0004");
        staff2[0].setGolonganArifin("3");
        staff2[0].setLemburArifin(15);
        staff2[0].setGajiLemburArifin(5500);
        
        staff2[1] = new Staff1841720128Arifin();
        staff2[1].setNamaArifin("Arie");
        staff2[1].setNipArifin("0006");
        staff2[1].setGolonganArifin("4");
        staff2[1].setLemburArifin(5);
        staff2[1].setGajiLemburArifin(100000);
        
        staff2[2] = new Staff1841720128Arifin();
        staff2[2].setNamaArifin("Mentari");
        staff2[2].setNipArifin("0007");
        staff2[2].setGolonganArifin("3");
        staff2[2].setLemburArifin(6);
        staff2[2].setGajiLemburArifin(20000);
        man[1].setStaffArifin(staff2);
        
        man[0].lihatInfoArifin();
        man[1].lihatInfoArifin();
    }
    
}
