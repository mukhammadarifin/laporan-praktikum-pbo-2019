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
public class Tester31841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720128Arifin pEmp = new PermanentEmployee1841720128Arifin("Dedik", 500);
        InternshipEmployee1841720128Arifin iEmp = new InternshipEmployee1841720128Arifin("Sunarto", 5);
        ElectricityBill1841720128Arifin eBill = new ElectricityBill1841720128Arifin("A-1", 5);
        Employee1841720128Arifin e[] = {pEmp, iEmp};
        Payable1841720128Arifin p[] = {pEmp, eBill};
        Employee1841720128Arifin e2[] = {pEmp, iEmp, eBill};
    }
    
}
