/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.tugas;

/**
 *
 * @author MuFin
 */
public class Kursi1841720128Arifin {
    private String nomer;
    private Penumpang1841720128Arifin penumpang;

    public Kursi1841720128Arifin(String nomer) {
        this.nomer = nomer;
    }

    public void setNomerArifin(String nomer) {
        this.nomer = nomer;
    }

    public void setPenumpangArifin(Penumpang1841720128Arifin penumpang) {
        this.penumpang = penumpang;
    }

    public String getNomerArifin() {
        return nomer;
    }

    public Penumpang1841720128Arifin getPenumpangArifin() {
        return penumpang;
    }
    
    public String infoArifin(){
        String info = "";
        info += "Nomor: " + nomer + "\n";
        if (this.penumpang != null){
            info += "penumpang: \n" + penumpang.infoArifin() + "\n";
        }
        return info;
    }
}