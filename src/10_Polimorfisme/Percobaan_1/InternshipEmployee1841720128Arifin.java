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
public class InternshipEmployee1841720128Arifin extends Employee1841720128Arifin{
    private int length;

    public InternshipEmployee1841720128Arifin(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public int getLengthArifin() {
        return length;
    }

    public void setLengthArifin(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfoArifin(){
        String info = super.getEmployeeInfoArifin()+"\n";
        info += "Registered as intership employee for "+length+"month/s\n";
        return info;
    }
}
