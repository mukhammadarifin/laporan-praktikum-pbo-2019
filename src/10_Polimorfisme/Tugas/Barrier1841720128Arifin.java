/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.Polimorfisme.Tugas;

/**
 *
 * @author MuFin
 */
public class Barrier1841720128Arifin implements Destroyable1841720128Arifin{
    
    private int strength;
    
    public Barrier1841720128Arifin(int strength) {
        this.strength = strength;
    }

    public int getStrengthArifin() {
        return strength;
    }

    @Override
    public void destroyedArifin() {
        strength -= strength * 0.1;
    }
    
    public void destroyArifin(){
        destroyedArifin();
    }
    
    public String getBarrierInfoArifin() {
        return "Barier Strength = "+strength;
    }
}
