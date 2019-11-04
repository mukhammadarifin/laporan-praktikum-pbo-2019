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
public abstract class Zombie1841720128Arifin implements Destroyable1841720128Arifin{
    protected int health;
    protected int level;
    
    public abstract void healArifin();

    @Override
    public abstract void destroyedArifin();
    
    public String getZombieInfoArifin(){
        return "\nLevel = "+level+"\nHealth = "+health;
    }
}
