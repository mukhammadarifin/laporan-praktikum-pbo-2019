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
public class JumpingZombie1841720128Arifin extends Zombie1841720128Arifin{

    public JumpingZombie1841720128Arifin(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void healArifin() {
        if(level == 1){
            health += health*0.2;
        } else if(level == 2){
            health += health*0.3;
        } else if(level == 3){
            health += health*0.4;
        }
    }

    @Override
    public void destroyedArifin() {
        health -= health*0.01;
    }
    
    public String getZombieInfoArifin(){
        String info = "Jumping Zombie Data = ";
        info += super.getZombieInfoArifin()+"\n";
        return info;
    }
}
