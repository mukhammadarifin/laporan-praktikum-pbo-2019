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
public class Plant1841720128Arifin {
    
    public void doDestroy(Destroyable1841720128Arifin d){
        
        if(d instanceof WalkingZombie1841720128Arifin){
            
            WalkingZombie1841720128Arifin wz = (WalkingZombie1841720128Arifin) d;
            wz.destroyedArifin();
        } 
        else if(d instanceof JumpingZombie1841720128Arifin){
            
            JumpingZombie1841720128Arifin jz = (JumpingZombie1841720128Arifin) d;
            jz.destroyedArifin();
        }
        else if(d instanceof Barrier1841720128Arifin){
            
            Barrier1841720128Arifin b = (Barrier1841720128Arifin) d;
            b.destroyedArifin();
        }
    }
}
