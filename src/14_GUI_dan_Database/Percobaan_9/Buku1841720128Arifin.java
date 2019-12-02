/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MuFin
 */
public class Buku1841720128Arifin {
    private int idbuku;
    private Kategori1841720128Arifin kategori = new Kategori1841720128Arifin();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbukuArifin() {
        return idbuku;
    }

    public void setIdbukuArifin(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720128Arifin getKategoriArifin() {
        return kategori;
    }

    public void setKategoriArifin(Kategori1841720128Arifin kategori) {
        this.kategori = kategori;
    }

    public String getJudulArifin() {
        return judul;
    }

    public void setJudulArifin(String judul) {
        this.judul = judul;
    }

    public String getPenerbitArifin() {
        return penerbit;
    }

    public void setPenerbitArifin(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulisArifin() {
        return penulis;
    }

    public void setPenulisArifin(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku1841720128Arifin() {
    
    }
    
    public Buku1841720128Arifin(Kategori1841720128Arifin kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720128Arifin getByIdArifin(int id) {
        Buku1841720128Arifin buku = new Buku1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720128Arifin();
                buku.setIdbukuArifin(rs.getInt("idbuku"));
                buku.getKategoriArifin().setIdkategoriArifin(rs.getInt("idbuku"));
                buku.getKategoriArifin().setNamaArifin(rs.getString("nama"));
                buku.getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                buku.setJudulArifin(rs.getString("judul"));
                buku.setPenerbitArifin(rs.getString("penerbit"));
                buku.setPenulisArifin(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720128Arifin> getAllArifin() {
        ArrayList<Buku1841720128Arifin> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720128Arifin buku = new Buku1841720128Arifin();
                buku.setIdbukuArifin(rs.getInt("idbuku"));
                buku.getKategoriArifin().setIdkategoriArifin(rs.getInt("idkategori"));
                buku.getKategoriArifin().setNamaArifin(rs.getString("nama"));
                buku.getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                buku.setJudulArifin(rs.getString("judul"));
                buku.setPenerbitArifin(rs.getString("penerbit"));
                buku.setPenulisArifin(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720128Arifin> searchArifin(String keyword) {
        ArrayList<Buku1841720128Arifin> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720128Arifin buku = new Buku1841720128Arifin();
                buku.setIdbukuArifin(rs.getInt("idbuku"));
                buku.getKategoriArifin().setIdkategoriArifin(rs.getInt("idkategori"));
                buku.getKategoriArifin().setNamaArifin(rs.getString("nama"));
                buku.getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                buku.setJudulArifin(rs.getString("judul"));
                buku.setPenerbitArifin(rs.getString("penerbit"));
                buku.setPenulisArifin(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void saveArifin() {
        if(getByIdArifin(idbuku).getIdbukuArifin() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.judul + "', "
                        + "'" + this.getKategoriArifin().getIdkategoriArifin() + "', "
                        + "'" + this.penulis + "', "
                        + "'" + this.penerbit + "'"
                        + ")";
            this.idbuku = DBHelper1841720128Arifin.insertQueryGetIdArifin(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.judul + "', "
                        + " idkategori = '" + this.getKategoriArifin().getIdkategoriArifin() + "', "
                        + " penulis = '" + this.penulis + "', "
                        + " penerbit = '" + this.penerbit + "' "
                        + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1841720128Arifin.executeQueryArifin(SQL);
        }
    }
    
    public void deleteArifin() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720128Arifin.executeQueryArifin(SQL);
    }
}
