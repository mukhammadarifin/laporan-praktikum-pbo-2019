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
public class PermanentEmployee1841720128Arifin extends Employee1841720128Arifin implements Payable1841720128Arifin{
    
    private int salary;

    public PermanentEmployee1841720128Arifin(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getPaymentAmountArifin() {
        return (int) (salary+0.05*salary);
    }
    
    public String getEmployeeInfoArifin(){
        String info = super.getEmployeeInfoArifin()+"\n";
        info += "Registered as permanent employee with salary "+salary+"\n";
        return info;
    }   
}
