/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author MuFin
 */
public class Anggota1841720128Arifin {

    private String nama;
    private String alamat;
    private float simpanan;

    Anggota1841720128Arifin(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        this.simpanan = simpanan;
    }

    public void setNamaArifin(String nama) {
        this.nama = nama;
    }

    public void setAlamatArifin(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaArifin() {
        return nama;
    }

    public String getAlamatArifin() {
        return alamat;
    }

    public float getSimpananArifin() {
        return simpanan;
    }

    public void setorArifin(float uang) {
        simpanan += uang;
    }

    public void pinjamArifin(float uang) {
        simpanan -= uang;
    }
}
