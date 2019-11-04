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
public class Tester41841720128Arifin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owner1841720128Arifin ow = new Owner1841720128Arifin();
        ElectricityBill1841720128Arifin eBill = new ElectricityBill1841720128Arifin("R-1", 5);
        ow.payArifin(eBill); //pay for electricity bill
        System.out.println("----------------------------");
        
        PermanentEmployee1841720128Arifin pEmp = new PermanentEmployee1841720128Arifin("Didik", 500);
        ow.payArifin(pEmp);//pay for permanent employee
        System.out.println("----------------------------");
        
        InternshipEmployee1841720128Arifin iEmp = new InternshipEmployee1841720128Arifin("Sunarto", 5);
        ow.showMyEmployee(iEmp); //show permanent employee info
        System.out.println("----------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
    }
    
}
