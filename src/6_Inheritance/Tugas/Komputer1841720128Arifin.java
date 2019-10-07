/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.tugas;

/**
 *
 * @author MuFin
 */
public class Komputer1841720128Arifin {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;

    public Komputer1841720128Arifin() {
    }

    public Komputer1841720128Arifin(String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData(){
        System.out.println("Merk: "+merk);
        System.out.println("Kecepatan Processor: "+kecProsesor);
        System.out.println("Size Memory: "+sizeMemory);
        System.out.println("Jenis Processor: "+jnsProsesor);
    }
}
