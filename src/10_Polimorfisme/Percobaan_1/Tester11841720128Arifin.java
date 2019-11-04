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
public class Tester11841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PermanentEmployee1841720128Arifin pEmp = new PermanentEmployee1841720128Arifin("Dedik", 500);
        InternshipEmployee1841720128Arifin iEmp = new InternshipEmployee1841720128Arifin("Sunarto", 5);
        ElectricityBill1841720128Arifin eBill = new ElectricityBill1841720128Arifin("A-1", 5);
        Employee1841720128Arifin e;
        Payable1841720128Arifin p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;  
    }
}
