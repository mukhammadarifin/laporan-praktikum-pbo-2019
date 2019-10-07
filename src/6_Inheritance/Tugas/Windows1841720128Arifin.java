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
public class Windows1841720128Arifin extends Laptop1841720128Arifin{
    public String fitur;

    public Windows1841720128Arifin() {
    }

    public Windows1841720128Arifin(String fitur, String jnsBatrei, String merk, int kecProsesor, int sizeMemory, String jnsProsesor) {
        super(jnsBatrei, merk, kecProsesor, sizeMemory, jnsProsesor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        super.tampilLaptop();
        System.out.println("Fitur: "+fitur);
    }
}
