/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.Collection.Percobaan4;

import java.util.ArrayList;

/**
 *
 * @author MuFin
 */
public class InputData1841720128Arifin {
    ArrayList<Mahasiswa1841720128Arifin> ListMahasiswa;

    public InputData1841720128Arifin(){
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataArifin(String Nim, String Nama, String Alamat){
        Mahasiswa1841720128Arifin mhs = new Mahasiswa1841720128Arifin(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720128Arifin> getDataArifn(){
        return ListMahasiswa;
    }
}
