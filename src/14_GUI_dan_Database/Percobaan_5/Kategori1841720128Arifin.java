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
    
        
    public void setIdkategoriArifin(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setKeteranganArifin(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdkategoriArifin() {
        return idkategori;
    }

    public String getNamaArifin() {
        return nama;
    }

    public String getKeteranganArifin() {
        return keterangan;
    } 
    
    public Kategori1841720128Arifin getByIdArifin(int id){
        
        Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");
        
        try{
            while(rs.next()){
                kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));   
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return kat;
    }
    
    public ArrayList<Kategori1841720128Arifin> getAllArifin(){
        
        ArrayList<Kategori1841720128Arifin> ListKategori = new ArrayList();
        
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM kategori");
        
        try{
            while(rs.next()){
                
                Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public ArrayList<Kategori1841720128Arifin> searchArifin(String keyword){
        
        ArrayList<Kategori1841720128Arifin> ListKategori = new ArrayList();
        
        String sql = "SELECT * FROM kategori WHERE " 
                + " nama LIKE '%" + keyword + "%' " 
                + " OR keterangan LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin(sql);
        
        try{
            while(rs.next()){
                Kategori1841720128Arifin kat = new Kategori1841720128Arifin();
                kat.setIdkategoriArifin(rs.getInt("idkategori"));
                kat.setNamaArifin(rs.getString("nama"));
                kat.setKeteranganArifin(rs.getString("keterangan"));
                
                ListKategori.add(kat);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListKategori;
    }
    
    public void saveArifin(){
        
        if(getByIdArifin(idkategori).getIdkategoriArifin() == 0){
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES ("
                    + " '" + this.nama + "', "
                    + " '" + this.keterangan + "' "
                    + " )";
            this.idkategori = DBHelper1841720128Arifin.insertQueryGetIdArifin(SQL);
        }
        else{
            String SQL = "UPDATE kategori SET "
                    + " nama = '" + this.nama + "', "
                    + " keterangan = '" + this.keterangan + "' "
                    + " WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1841720128Arifin.executeQueryArifin(SQL);
        }
    }
    
    public void deleteArifin(){
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720128Arifin.executeQueryArifin(SQL);
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
