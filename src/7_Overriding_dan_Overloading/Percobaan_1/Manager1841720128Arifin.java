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
public class Manager1841720128Arifin extends Karyawan1841720128Arifin{
    private double tunjangan;
    private String bagian;
    private Staff1841720128Arifin st[];

    public double getTunjanganArifin() {
        return tunjangan;
    }

    public String getBagianArifin() {
        return bagian;
    }

    public void setTunjanganArifin(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setBagianArifin(String bagian) {
        this.bagian = bagian;
    }
    
    public void setStaffArifin(Staff1841720128Arifin st[]){
        this.st = st;
    }
    
    public void viewStaffArifin(){
        int i;
        System.out.println("-----------------");
        for(i=0; i<st.length; i++){
            st[i].lihatInfoArifin();
        }
        System.out.println("-----------------");
    }
    
    public void lihatInfoArifin(){
        System.out.println("Manager : "+this.getBagianArifin());
        System.out.println("NIP : "+this.getNipArifin());
        System.out.println("Nama : "+this.getNamaArifin());
        System.out.println("Golongan : "+this.getGolonganArifin());
        System.out.printf("Tunjangan :%.0f\n", this.getTunjanganArifin());
        System.out.printf("Gaji :%.0f\n", this.getGajiArifin());
        System.out.println("bagian : "+this.getBagianArifin());
        this.viewStaffArifin();
    }
    
    @Override
    public double getGajiArifin(){
        return super.getGajiArifin()+tunjangan;
    }
}
