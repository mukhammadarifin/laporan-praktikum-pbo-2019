/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

/**
 *
 * @author MuFin
 */
public class TestBackend1841720128Arifin {

    public static void main(String[] args) {
        Anggota1841720128Arifin agt1 = new Anggota1841720128Arifin("iqbal", "mojokerto", "0293482384");
        Anggota1841720128Arifin agt2 = new Anggota1841720128Arifin("agung", "tulungagung", "19203123");
        Anggota1841720128Arifin agt3 = new Anggota1841720128Arifin("napis", "kalimantan", "192837213");

        agt1.save();
        agt2.save();
        agt3.save();

        agt2.setAlamatArifin("kota malang");
        agt2.save();

        agt3.delete();

        for (Anggota1841720128Arifin k : new Anggota1841720128Arifin().getAll()) {
            System.out.println("Nama: " + k.getNamaArifin() + ", telp: " + k.getTeleponArifin() + ", alamat: " + k.getAlamatArifin());
        }

        for (Anggota1841720128Arifin k : new Anggota1841720128Arifin().search("ilmiah")) {
            System.out.println("Nama: " + k.getNamaArifin() + ", telp: " + k.getTeleponArifin() + ", alamat: " + k.getAlamatArifin());
        }
    }

}
