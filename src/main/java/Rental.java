/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jasarentalsepeda;

/**
 *
 * @author acer
 */
public class Rental {

    String idRental;
    String namaPelanggan;
    String jenisSepeda;
    int hargaSewa;
    int lamaSewa;
    String satuanSewa;

    public Rental(String idRental, String namaPelanggan, String jenisSepeda, int hargaSewa, int lamaSewa, String satuanSewa) {
        this.idRental = idRental;
        this.namaPelanggan = namaPelanggan;
        this.jenisSepeda = jenisSepeda;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.satuanSewa = satuanSewa;
    }

    public int hitungTotal() {
        return hargaSewa * lamaSewa;
    }

    public void tampilkanData() {
        System.out.println();
        System.out.println("=== DATA RENTAL ===");
        System.out.println("ID Rental      : " + idRental);
        System.out.println("Nama Pelanggan : " + namaPelanggan);
        System.out.println("Jenis Sepeda   : " + jenisSepeda);
        System.out.println("Harga Sewa     : Rp" + hargaSewa + "/" + satuanSewa);
        System.out.println("Lama Sewa      : " + lamaSewa + " " + satuanSewa);
        System.out.println("Total Biaya    : Rp" + hitungTotal());
    }
}