/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author WINDOWS 10
 */
public class Peminjaman1841720128Arifin {
    private int idpeminjaman;
    private Anggota1841720128Arifin anggota = new Anggota1841720128Arifin();
    private Buku1841720128Arifin buku = new Buku1841720128Arifin();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720128Arifin() {
    }

    public Peminjaman1841720128Arifin(Anggota1841720128Arifin anggota, Buku1841720128Arifin buku, String tanggalpinjam, String tanggalkembali) {        
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }    

    public int getIdpeminjamanArifin() {
        return idpeminjaman;
    }

    public void setIdpeminjamanArifin(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720128Arifin getAnggotaArifin() {
        return anggota;
    }

    public void setAnggotaArifin(Anggota1841720128Arifin anggota) {
        this.anggota = anggota;
    }

    public Buku1841720128Arifin getBukuArifin() {
        return buku;
    }

    public void setBukuArifin(Buku1841720128Arifin buku) {
        this.buku = buku;
    }

    public String getTanggalpinjamArifin() {
        return tanggalpinjam;
    }

    public void setTanggalpinjamArifin(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembaliArifin() {
        return tanggalkembali;
    }

    public void setTanggalkembaliArifin(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    
    public Peminjaman1841720128Arifin getByIdArifin(int id){
        Peminjaman1841720128Arifin peminjaman = new Peminjaman1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1841720128Arifin();
                peminjaman.setIdpeminjamanArifin(rs.getInt("idbuku"));
                peminjaman.getAnggotaArifin().setIdAnggotaArifin(rs.getInt("idanggota"));
                peminjaman.getAnggotaArifin().setNamaArifin(rs.getString("nama_anggota"));
                peminjaman.getAnggotaArifin().setAlamatArifin(rs.getString("alamat"));
                peminjaman.getAnggotaArifin().setTeleponArifin(rs.getString("telepon"));
                peminjaman.getBukuArifin().setIdbukuArifin(rs.getInt("idbuku"));
                peminjaman.getBukuArifin().getKategoriArifin().setIdkategoriArifin(rs.getInt("idkategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setNamaArifin(rs.getString("nama_kategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                peminjaman.getBukuArifin().setJudulArifin(rs.getString("judul"));
                peminjaman.getBukuArifin().setPenerbitArifin(rs.getString("penerbit"));
                peminjaman.getBukuArifin().setPenulisArifin(rs.getString("penulis"));
                peminjaman.setTanggalpinjamArifin(rs.getDate("tanggalpinjam").toString());
                peminjaman.setTanggalkembaliArifin(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720128Arifin> getAllArifin(){
        ArrayList<Peminjaman1841720128Arifin> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1841720128Arifin peminjaman = new Peminjaman1841720128Arifin();
                peminjaman.setIdpeminjamanArifin(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaArifin().setIdAnggotaArifin(rs.getInt("idanggota"));
                peminjaman.getAnggotaArifin().setNamaArifin(rs.getString("nama_anggota"));
                peminjaman.getAnggotaArifin().setAlamatArifin(rs.getString("alamat"));
                peminjaman.getAnggotaArifin().setTeleponArifin(rs.getString("telepon"));
                peminjaman.getBukuArifin().setIdbukuArifin(rs.getInt("idbuku"));
                peminjaman.getBukuArifin().getKategoriArifin().setIdkategoriArifin(rs.getInt("idkategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setNamaArifin(rs.getString("nama_kategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                peminjaman.getBukuArifin().setJudulArifin(rs.getString("judul"));
                peminjaman.getBukuArifin().setPenerbitArifin(rs.getString("penerbit"));
                peminjaman.getBukuArifin().setPenulisArifin(rs.getString("penulis"));
                peminjaman.setTanggalpinjamArifin(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliArifin(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720128Arifin> searchArifin(String keyword){
        ArrayList<Peminjaman1841720128Arifin> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1841720128Arifin peminjaman = new Peminjaman1841720128Arifin();
                peminjaman.setIdpeminjamanArifin(rs.getInt("idbuku"));
                peminjaman.getAnggotaArifin().setIdAnggotaArifin(rs.getInt("idanggota"));
                peminjaman.getAnggotaArifin().setNamaArifin(rs.getString("nama_anggota"));
                peminjaman.getAnggotaArifin().setAlamatArifin(rs.getString("alamat"));
                peminjaman.getAnggotaArifin().setTeleponArifin(rs.getString("telepon"));
                peminjaman.getBukuArifin().setIdbukuArifin(rs.getInt("idbuku"));
                peminjaman.getBukuArifin().getKategoriArifin().setIdkategoriArifin(rs.getInt("idkategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setNamaArifin(rs.getString("nama_kategori"));
                peminjaman.getBukuArifin().getKategoriArifin().setKeteranganArifin(rs.getString("keterangan"));
                peminjaman.getBukuArifin().setJudulArifin(rs.getString("judul"));
                peminjaman.getBukuArifin().setPenerbitArifin(rs.getString("penerbit"));
                peminjaman.getBukuArifin().setPenulisArifin(rs.getString("penulis"));
                peminjaman.setTanggalpinjamArifin(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliArifin(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void saveArifin(){
        if(getByIdArifin(idpeminjaman).getIdpeminjamanArifin()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggotaArifin().getIdAnggotaArifin()+"', "
                    +"      '"+ this.getBukuArifin().getIdbukuArifin()+"', "
                    +"      '"+ this.tanggalpinjam + "', "
                    +"      '"+ this.tanggalkembali + "' "
                    +"      )";
            this.idpeminjaman = DBHelper1841720128Arifin.insertQueryGetIdArifin(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggotaArifin().getIdAnggotaArifin() + "', "
                    +"      idbuku = '"+ this.getBukuArifin().getIdbukuArifin()+"', "
                    +"      tanggalpinjam = '"+ this.tanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.tanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.idpeminjaman + "'";
            DBHelper1841720128Arifin.executeQueryArifin(SQL);
        }
    }
    
    public void deleteArifin(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720128Arifin.executeQueryArifin(SQL);
    }
}
