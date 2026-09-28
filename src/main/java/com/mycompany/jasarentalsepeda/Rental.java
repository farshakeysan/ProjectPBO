package com.mycompany.jasarentalsepeda;

public class Rental {

    private String idRental;
    private String namaPelanggan;
    private String jenisSepeda;
    private int hargaSewa;
    private int lamaSewa;
    private String satuanSewa;

    public Rental(String idRental, String namaPelanggan, String jenisSepeda,
                  int hargaSewa, int lamaSewa, String satuanSewa) {
        this.idRental = idRental;
        this.namaPelanggan = namaPelanggan;
        this.jenisSepeda = jenisSepeda;
        this.hargaSewa = hargaSewa;
        this.lamaSewa = lamaSewa;
        this.satuanSewa = satuanSewa;
    }

    public String getIdRental() {
        return idRental;
    }

    public void setIdRental(String idRental) {
        this.idRental = idRental;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenisSepeda) {
        this.jenisSepeda = jenisSepeda;
    }

    public int getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(int hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        if (lamaSewa > 0) {
            this.lamaSewa = lamaSewa;
        } else {
            System.out.println("Lama sewa harus lebih dari 0!");
        }
    }

    public String getSatuanSewa() {
        return satuanSewa;
    }

    public void setSatuanSewa(String satuanSewa) {
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