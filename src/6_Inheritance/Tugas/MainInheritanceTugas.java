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
public class MainInheritanceTugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mac1841720128Arifin m = new Mac1841720128Arifin("WPA2", "Ion", "Apple", 30, 5, "NiMH");
        Windows1841720128Arifin w = new Windows1841720128Arifin("Color Integration", "Ion", "Asus", 30, 5, "NiMH");
        Pc1841720128Arifin p = new Pc1841720128Arifin(120, "Dell", 35, 30, "Upper");
        
        m.tampilMac();
        w.tampilWindows();
        p.tampilPc();
    }
    
}
