/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MuFin
 */
public class Kategori1841720128Arifin {

    private int idkategori;
    private String nama;
    private String keterangan;

    public Kategori1841720128Arifin() {

    }

    public Kategori1841720128Arifin(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public int getIdkategoriArifin() {
        return idkategori;
    }

    public void setIdkategoriArifin(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNamaArifin() {
        return nama;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public String getKeteranganArifin() {
        return keterangan;
    }

    public void setKeteranganArifin(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720128Arifin getByIdArifin(int id) {
        Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("Select * from kategori where idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720128Arifin> getAllArifin() {
        ArrayList<Kategori1841720128Arifin> ListKategori = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("Select * from kategori");
        try {
            while (rs.next()) {
                Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720128Arifin> searchArifin(String keyword) {
        ArrayList<Kategori1841720128Arifin> ListKategori = new ArrayList();
        String sql = "Select * from kategori where nama like '%" + keyword + "%' or keterangan like '%" + keyword + "%'";
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin(sql);
        try {
            while (rs.next()) {
                Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void saveArifin() {
        if (getByIdArifin(idkategori).getIdkategoriArifin() == 0) {
            String sql = "INSERT INTO kategori (nama, keterangan) values ('" + this.nama + "','" + this.keterangan + "')";
            this.idkategori = DBHelper1841720128Arifin.insertQueryGetIdArifin(sql);
        } else {
            String SQL = "Update kategori set nama = '" + this.nama + "', keterangan = '" + this.keterangan + "'"
                    + "where idkategori = '" + this.idkategori + "'";
            DBHelper1841720128Arifin.executeQueryArifin(SQL);
        }
    }

    public void deleteArifin() {
        String SQL = "Delete from kategori where idkategori = '" + this.idkategori + "'";
        DBHelper1841720128Arifin.executeQueryArifin(SQL);
    }

    public String toStringArifin() {
        return nama;
    }

    ArrayList<Kategori1841720128Arifin> getByNamaAndKeteranganArifin(String nama, String keterangan) {
        ArrayList<Kategori1841720128Arifin> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (keterangan.trim().length() > 0)) {
            rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM kategori Where nama = '"
                    + nama + "' and keterangan = '" + keterangan + "'");
        } else if ((nama.trim().length() > 0) && (keterangan.trim().length() == 0)) {
            rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM kategori Where nama = '"
                    + nama + "'");
        } else {
            rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM kategori Where keterangan'" + keterangan + "'  ");
        }

        try {
            while (rs.next()) {
                Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

}
