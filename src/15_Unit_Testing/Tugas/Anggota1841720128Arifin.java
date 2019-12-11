/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.anggota;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author MuFin
 */
public class Anggota1841720128Arifin {

    private int idanggota;
    private String nama;
    private String alamat;
    private String telepon;

    public Anggota1841720128Arifin() {

    }

    public Anggota1841720128Arifin(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getIdanggotaArifin() {
        return idanggota;
    }

    public void setIdanggotaArifin(int idanggota) {
        this.idanggota = idanggota;
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

    public Anggota1841720128Arifin getById(int id) {
        Anggota1841720128Arifin a = new Anggota1841720128Arifin();
        ResultSet rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota "
                + "WHERE idanggota = '" + id + "'");
        try {
            while (rs.next()) {
                a = new Anggota1841720128Arifin();
                a.setIdanggotaArifin(rs.getInt("idanggota"));
                a.setNamaArifin(rs.getString("nama"));
                a.setAlamatArifin(rs.getString("alamat"));
                a.setTeleponArifin(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a;
    }

    public ArrayList<Anggota1841720128Arifin> getAll() {
        ArrayList<Anggota1841720128Arifin> ListAnggota = new ArrayList();
        ResultSet rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota");
        try {
            while (rs.next()) {
                Anggota1841720128Arifin a = new Anggota1841720128Arifin();
                a.setIdanggotaArifin(rs.getInt("idanggota"));
                a.setNamaArifin(rs.getString("nama"));
                a.setAlamatArifin(rs.getString("alamat"));
                a.setTeleponArifin(rs.getString("telepon"));
                ListAnggota.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720128Arifin> search(String keyword) {
        ArrayList<Anggota1841720128Arifin> ListAnggota = new ArrayList();
        String sql = "SELECT * FROM anggota WHERE "
                + "     nama LIKE '%" + keyword + "%' "
                + "     OR alamat LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720128Arifin.selectQuery(sql);
        try {
            while (rs.next()) {
                Anggota1841720128Arifin a = new Anggota1841720128Arifin();
                a.setIdanggotaArifin(rs.getInt("idanggota"));
                a.setNamaArifin(rs.getString("nama"));
                a.setAlamatArifin(rs.getString("alamat"));
                a.setTeleponArifin(rs.getString("telepon"));
                ListAnggota.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void save() {
        if (getById(idanggota).getIdanggotaArifin() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES("
                    + "     '" + this.nama + "', "
                    + "     '" + this.alamat + "', "
                    + "     '" + this.telepon + "' "
                    + "     )";
            this.idanggota = DBHelper1841720128Arifin.insertQueryGetIdArifin(SQL);
        } else {
            String SQL = "UPDATE anggota SET "
                    + "     nama = '" + this.nama + "', "
                    + "     alamat = '" + this.alamat + "', "
                    + "     telepon = '" + this.telepon + "' "
                    + "     WHERE idanggota = '" + this.idanggota + "'";
            DBHelper1841720128Arifin.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idanggota + "'";
        DBHelper1841720128Arifin.executeQuery(SQL);
    }

    public ArrayList<Anggota1841720128Arifin> getByNamaAlamatAndTelepon(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720128Arifin> ListKategori = new ArrayList();
        ResultSet rs;

        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "' AND telepon = '" + telepon + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE nama = '" + nama + "'");
        } else if ((nama.trim().length() == 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM anggota WHERE alamat = '" + alamat + "'");
        } else {
            rs = DBHelper1841720128Arifin.selectQuery("SELECT * FROM kategori WHERE telepon = '" + telepon + "'");
        }

        try {
            while (rs.next()) {
                Anggota1841720128Arifin agt = new Anggota1841720128Arifin();
                agt.setIdanggotaArifin(rs.getInt("idanggota"));
                agt.setNamaArifin(rs.getString("nama"));
                agt.setAlamatArifin(rs.getString("alamat"));
                agt.setTeleponArifin(rs.getString("telepon"));
                ListKategori.add(agt);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
}
