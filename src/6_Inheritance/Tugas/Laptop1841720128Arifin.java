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
public class Laptop1841720128Arifin extends Komputer1841720128Arifin {
    public String jnsBatrei;

    public Laptop1841720128Arifin() {
    }

    public Laptop1841720128Arifin(String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    
    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai: "+jnsBatrei);
    }
}
