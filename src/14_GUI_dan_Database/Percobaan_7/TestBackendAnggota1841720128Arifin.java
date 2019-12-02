/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.Anggota1841720128Arifin;

/**
 *
 * @author MuFin
 */
public class TestBackendAnggota1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Anggota1841720128Arifin agt1 = new Anggota1841720128Arifin("Layla", "Malang", "123");
        Anggota1841720128Arifin agt2 = new Anggota1841720128Arifin("Lydya", "Bojonegoro", "456");
        Anggota1841720128Arifin agt3 = new Anggota1841720128Arifin("Amir", "Surabaya", "789");
        
        //test insert
        agt1.save();
        agt2.save();
        agt3.save();
        
        //test update
        agt2.setAlamatArifin("Jawa Timur");
        agt2.save();
        
        //test delete
        agt3.delete();
        
        //tes select all
        for(Anggota1841720128Arifin k : new Anggota1841720128Arifin().getAll()){
            System.out.println("Nama: " + k.getNamaArifin() + ", Alamat : " + k.getAlamatArifin() + ", Telepon : " + k.getTeleponArifin());
        }
        
        //test search
        for(Anggota1841720128Arifin a : new Anggota1841720128Arifin().search("Timur")){
            System.out.println("Nama: " + a.getNamaArifin() + ", Alamat : " + a.getAlamatArifin() + ", Telepon : " + a.getTeleponArifin());
        }
    }
    
}
