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
public class MainPercobaan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processor1841720128Arifin p = new Processor1841720128Arifin("Intel i5", 3);
        Laptop1841720128Arifin L = new Laptop1841720128Arifin("Thinkpad", p);
        
        L.infoArifin();
        
        Processor1841720128Arifin p1 = new Processor1841720128Arifin();
        p1.setMerkArifin("Intel i5");
        p1.setCacheArifin(4);
        Laptop1841720128Arifin L1 = new Laptop1841720128Arifin();
        L1.setMerkArifin("Thinkpad");
        L1.setProcArifin(p1);
        L1.infoArifin();
    }
    
}
