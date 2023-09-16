/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inven;

/**
 *
 * @author ahmad al fajri
 */
public class Barang {

    private String kode_barang;
    private String nama_barang;
    private int stok;

    public String getKode_barang() {
        return kode_barang;
    }

    // Setter untuk kode_barang
    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    // Getter untuk nama_barang
    public String getNama_barang() {
        return nama_barang;
    }

    // Setter untuk nama_barang
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        addStok(this.stok);
    }

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    public void addStok(int value) {
        this.stok += value;

    }
}
