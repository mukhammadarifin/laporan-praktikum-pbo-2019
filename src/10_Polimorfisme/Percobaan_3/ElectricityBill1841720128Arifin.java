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
public class ElectricityBill1841720128Arifin implements Payable1841720128Arifin{
    private int kwh;
    private String category;

    ElectricityBill1841720128Arifin(String category, int kwh) {
        this.kwh = kwh;
        this.category = category;
    }

    public int getKwhArifin() {
        return kwh;
    }

    public void setKwhArifin(int kwh) {
        this.kwh = kwh;
    }

    public String getCategoryArifin() {
        return category;
    }

    public void setCategoryArifin(String category) {
        this.category = category;
    }

    @Override
    public int getPaymentAmountArifin() {
        return kwh*getBasePriceArifin();
    }

    public int getBasePriceArifin() {
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;break;
            case "R-2" : bPrice = 200;break;
        }
        return bPrice;
    }
    
    public String getBillInfoArifin(){
        return "KWH = "+kwh+"\n"+
                "Category = "+category+"("+getBasePriceArifin()+" per KWH)\n";
    }
}
