/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.tugasno1;

/**
 *
 * @author MuFin
 */
public class Segitiga1841720128Arifin {
    private int sudut;

    public int totalSudutArifin(int sudutA){
        sudut = 180 - sudutA;
        
        return sudut;
    }
    
    public int totalSudutArifin(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        
        return sudut;
    }
    
    public int kelilingArifin(int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        
        return keliling;
    }
    
    public double kelilingArifin(int sisiA, int sisiB){
        
        double sisiC = Math.sqrt(Math.pow(sisiA, 2)+Math.pow(sisiB, 2));
        
        return sisiC;
    }
    
    public void hasilArifin(){
        System.out.println("hasil : ");
    }
}
