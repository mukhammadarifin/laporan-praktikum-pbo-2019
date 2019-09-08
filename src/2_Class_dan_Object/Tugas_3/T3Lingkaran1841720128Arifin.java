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
public class T3Lingkaran1841720128Arifin {
    public double phi;
    public double r;
    
    public double hitungLuasArifin(){
        double luas = phi * r;
        
        return luas;
    }
    
    public double hitungKelilingArifin(){
        double keliling = phi * r/2;
        
        return keliling;
    }
    
    public void cetakHasilArifin(){
        System.out.println("PHI : "+phi);
        System.out.println("Jari-jari : "+r);
        System.out.println("Luas : "+hitungLuasArifin());
        System.out.println("Keliling : "+hitungKelilingArifin());
    }
}
