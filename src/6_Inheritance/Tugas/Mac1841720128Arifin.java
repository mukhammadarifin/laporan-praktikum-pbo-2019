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
public class Mac1841720128Arifin extends Laptop1841720128Arifin{
    public String security;

    public Mac1841720128Arifin() {
    }

    public Mac1841720128Arifin(String security, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.security = security;
    }
    
    public void tampilMac(){
        super.tampilLaptop();
        System.out.println("Security: "+security);
    }
}
