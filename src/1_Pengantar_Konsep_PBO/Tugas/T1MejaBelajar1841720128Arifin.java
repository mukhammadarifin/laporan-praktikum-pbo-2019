/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet1;

/**
 *
 * @author MuFin
 */
public class T1MejaBelajar1841720128Arifin extends T1Meja1841720128Arifin {
    private String tipeMeja;
    
    public void sTM(String setTipeMeja){
        tipeMeja = setTipeMeja;
    }
    
    public void cetakStatus(){
        super.cetakSatus();
        System.out.println("Tipe Meja: "+tipeMeja);
    }
}
