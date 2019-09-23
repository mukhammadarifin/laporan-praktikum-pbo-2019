/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan3;

/**
 *
 * @author MuFin
 */
public class MainPertanyaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pegawai1841720128Arifin masinis = new Pegawai1841720128Arifin("1234", "Spongebob Squarepants");
        Pegawai1841720128Arifin asisten = new Pegawai1841720128Arifin("2000", "Patrick the Star");
        KeretaApi1841720128Arifin keretaApi = new KeretaApi1841720128Arifin("Gaya Baru", "Bisnis", masinis, asisten);
        
        System.out.println(keretaApi.infoArifin());
    }
    
}
