/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.inheritance.percobaan3;

/**
 *
 * @author MuFin
 */
public class Tabung1841720128Arifin extends Bangun1841720128Arifin{
    protected int t;
    
    public void setSuperPhiArifin(double phi){
        super.phi = phi;
    }
    
    public void setSuperRArifin(int r){
        super.r = r;
    }

    public void setTArifin(int t) {
        this.t = t;
    }
    
    public void volumeArifin(){
        System.out.println("Volume Tabung adalah: "+(super.phi*super.r*super.r*this.t));
    }
}
