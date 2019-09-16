/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorEncapsulation;

/**
 *
 * @author MuFin
 */
public class Motor1841720128Arifin {
    public int kecepatan = 0;
    public boolean kontakOn = false;
   
    public void printStatusArifin(){
        if (kontakOn == true){
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}
