package jobsheet1;

/**
 *
 * @author MuFin
 */
public class Sepeda1841720128Arifin {
    private String merek;
    private int kecepatan;
    private int gear;
    
    public void setMerekArifin(String newValue) {
        merek = newValue;
    }
    
    public void gantiGearArifin(int newValue) {
        gear = newValue;
    }
    
    public void tambahKecepatanArifin(int increment) {
        kecepatan = kecepatan + increment;
    }
    
    public void remArifin(int decrement) {
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakSatusArifin() {
        System.out.println("Merek: "+merek);
        System.out.println("Kecepatan: "+kecepatan);
        System.out.println("Gear: "+gear);  
    }
}
