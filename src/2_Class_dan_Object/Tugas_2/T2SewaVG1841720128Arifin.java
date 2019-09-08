/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet2;

/**
 *
 * @author MuFin
 */
public class T2SewaVG1841720128Arifin {
    public int id;
    public String namem;
    public String nagem;
    public int harga;
    public int lamsew;
    
    public int totalHargaArifin(){
        int total = harga*lamsew;
        
        return total;
    }
    
    public void cetakHasilArifin(){
        System.out.println("ID : "+id);
        System.out.println("Name : "+namem);
        System.out.println("Name Game : "+nagem);
        System.out.println("Harga sewa game : Rp."+harga);
        System.out.println("Lama sewa : "+lamsew+" hari");
        System.out.println("Harga yang harus dibayar : Rp."+totalHargaArifin());
    }
}
