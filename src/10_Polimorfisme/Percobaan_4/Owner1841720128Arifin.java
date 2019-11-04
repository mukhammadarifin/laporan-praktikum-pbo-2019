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
public class Owner1841720128Arifin {
    public void payArifin(Payable1841720128Arifin p){
        System.out.println("Total payment = "+p.getPaymentAmountArifin());
        if(p instanceof ElectricityBill1841720128Arifin){
            ElectricityBill1841720128Arifin eb = (ElectricityBill1841720128Arifin) p;
            System.out.println(""+eb.getBillInfoArifin());
        } else if(p instanceof PermanentEmployee1841720128Arifin){
            PermanentEmployee1841720128Arifin pe = (PermanentEmployee1841720128Arifin) p;
            pe.getEmployeeInfoArifin();
            System.out.println(""+pe.getEmployeeInfoArifin());
        }
    }
    
    public void showMyEmployee(Employee1841720128Arifin e){
        System.out.println(""+e.getEmployeeInfoArifin());
        if(e instanceof PermanentEmployee1841720128Arifin){
            System.out.println("You have to pay her/him monthly!!!");
        } else{
            System.out.println("No need to pay him/her :)");
        }
    }
}
