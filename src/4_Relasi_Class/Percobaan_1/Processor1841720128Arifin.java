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
public class Processor1841720128Arifin {
    private String merk;
    private double cache;
    
    Processor1841720128Arifin(String merk, double cache){
        this.merk = merk;
        this.cache = cache;
    }

    public Processor1841720128Arifin() {
    }

    public String getMerkArifin() {
        return merk;
    }

    public double getCacheArifin() {
        return cache;
    }

    public void setMerkArifin(String merk) {
        this.merk = merk;
    }

    public void setCacheArifin(double cache) {
        this.cache = cache;
    }
    
    public void infoArifin(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
