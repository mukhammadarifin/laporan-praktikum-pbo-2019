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
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesinArifin(){
        kontakOn = true;
    }
    public void matikanMesinArifin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatanArifin(){
       if (kontakOn == true){
           kecepatan += 5;
       }
       else{
           System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
       }
    }
    public void kurangKecepatanArifin(){
        if (kontakOn == true){
            kecepatan -= 5;
        }
        else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
    }
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
