/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.Polimorfisme.Percobaan1;

/**
 *
 * @author MuFin
 */
public class Tester21841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720128Arifin pEmp = new PermanentEmployee1841720128Arifin("Dedik", 500);
        Employee1841720128Arifin e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoArifin());
        System.out.println("-----------------------");
        System.out.println(""+pEmp.getEmployeeInfoArifin());
    }
    
}
