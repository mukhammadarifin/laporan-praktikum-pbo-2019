/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.relasiclass.percobaan1;

/**
 *
 * @author MuFin
 */
public class Laptop1841720128Arifin {
    private String merk;
    private Processor1841720128Arifin proc;

    public Laptop1841720128Arifin() {
    }

    public Laptop1841720128Arifin(String merk, Processor1841720128Arifin proc) {
        this.merk = merk;
        this.proc = proc;
    }

    public String getMerkArifin() {
        return merk;
    }

    public Processor1841720128Arifin getProcArifin() {
        return proc;
    }

    public void setMerkArifin(String merk) {
        this.merk = merk;
    }

    public void setProcArifin(Processor1841720128Arifin proc) {
        this.proc = proc;
    }
    
    public void infoArifin(){
        System.out.println("Merk Laptop = " + merk);
        proc.infoArifin();
    }
}
