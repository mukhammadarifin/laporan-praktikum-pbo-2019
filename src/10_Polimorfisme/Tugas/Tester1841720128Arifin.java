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
public class Tester1841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WalkingZombie1841720128Arifin wz = new WalkingZombie1841720128Arifin(100, 1);
        JumpingZombie1841720128Arifin jz = new JumpingZombie1841720128Arifin(100, 2);
        Barrier1841720128Arifin b = new Barrier1841720128Arifin(100);
        Plant1841720128Arifin p = new Plant1841720128Arifin();
        System.out.println(""+wz.getZombieInfoArifin());
        System.out.println(""+jz.getZombieInfoArifin());
        System.out.println(""+b.getBarrierInfoArifin());
        System.out.println("----------------------------");
        for(int i=0; i<4; i++){
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
        }
        System.out.println(""+wz.getZombieInfoArifin());
        System.out.println(""+jz.getZombieInfoArifin());
        System.out.println(""+b.getBarrierInfoArifin());
    }
}
