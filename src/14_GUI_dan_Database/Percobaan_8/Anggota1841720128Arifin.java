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
public class Anggota1841720128Arifin {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggotaArifin() {
        return idAnggota;
    }

    public void setIdAnggotaArifin(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaArifin() {
        return nama;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public String getAlamatArifin() {
        return alamat;
    }

    public void setAlamatArifin(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponArifin() {
        return telepon;
    }

    public void setTeleponArifin(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720128Arifin() {
    }

    public Anggota1841720128Arifin(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota1841720128Arifin getByIdArifin(int id) {
        Anggota1841720128Arifin agt = new Anggota1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720128Arifin();
                agt.setIdAnggotaArifin(rs.getInt("idAnggota"));
                agt.setNamaArifin(rs.getString("nama"));
                agt.setAlamatArifin(rs.getString("alamat"));
                agt.setTeleponArifin(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720128Arifin> getAllArifin() {
        ArrayList<Anggota1841720128Arifin> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720128Arifin agt = new Anggota1841720128Arifin();
                agt.setIdAnggotaArifin(rs.getInt("idAnggota"));
                agt.setNamaArifin(rs.getString("nama"));
                agt.setAlamatArifin(rs.getString("alamat"));
                agt.setTeleponArifin(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota1841720128Arifin> searchArifin(String keyword) {
        ArrayList<Anggota1841720128Arifin> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720128Arifin.selectQueryArifin(sql);

        try {
            while (rs.next()) {
                Anggota1841720128Arifin agt = new Anggota1841720128Arifin();
                agt.setIdAnggotaArifin(rs.getInt("idAnggota"));
                agt.setNamaArifin(rs.getString("nama"));
                agt.setAlamatArifin(rs.getString("alamat"));
                agt.setTeleponArifin(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void saveArifin(){
        if(getByIdArifin(idAnggota).getIdAnggotaArifin() == 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.nama + "', "
                    + " '" +this.alamat + "', "
                    + " '"+this.telepon+"' "
                    + " )";
                    this.idAnggota = DBHelper1841720128Arifin.insertQueryGetIdArifin(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.nama +"', "
                   + " alamat = '" +this.alamat +"', "
                   + " telepon = '"+this.telepon+"' "
                   +"Where idAnggota = '"+this.idAnggota+"'";
            DBHelper1841720128Arifin.executeQueryArifin(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.idAnggota+"'";
        DBHelper1841720128Arifin.executeQueryArifin(SQL);
    }
}
