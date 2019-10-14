/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arifin.overloading_dan_overriding.percobaan1;

/**
 *
 * @author MuFin
 */
public class Staff1841720128Arifin extends Karyawan1841720128Arifin{
    private int lembur;
    private double gajiLembur;

    public void setLemburArifin(int lembur) {
        this.lembur = lembur;
    }

    public void setGajiLemburArifin(double gajiLembur) {
        this.gajiLembur = gajiLembur;
    }

    public int getLemburArifin() {
        return lembur;
    }

    public double getGajiLemburArifin() {
        return gajiLembur;
    }
    
    public double getGajiArifin(int lembur, double gajiLembur){
        return super.getGajiArifin()+lembur*gajiLembur;
    }
    
    @Override
    public double getGajiArifin(){
        return super.getGajiArifin()+lembur*gajiLembur;
    }
    
    public void lihatInfoArifin(){
        System.out.println("NIP: "+this.getNipArifin());
        System.out.println("Nama: "+this.getNamaArifin());
        System.out.println("Golongan : "+this.getGolonganArifin());
        System.out.println("Jml Lembur : "+this.getLemburArifin());
        System.out.printf("Gaji Lembur :%.0f\n", this.getGajiLemburArifin());
        System.out.printf("Gaji :%.0f\n", this.getGajiArifin());
    }
}
