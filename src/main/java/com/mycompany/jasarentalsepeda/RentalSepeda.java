package com.mycompany.jasarentalsepeda;

public class RentalSepeda extends Rental {

    private String jenisRem;

    public RentalSepeda(String idRental, String namaPelanggan, String jenisSepeda,
                        int hargaSewa, int lamaSewa, String satuanSewa,
                        String jenisRem) {

        super(idRental, namaPelanggan, jenisSepeda, hargaSewa, lamaSewa, satuanSewa);
        this.jenisRem = jenisRem;
    }

    public String getJenisRem() {
        return jenisRem;
    }

    public void setJenisRem(String jenisRem) {
        this.jenisRem = jenisRem;
    }

    @Override
    public void tampilkanData() {
        System.out.println();
        System.out.println("=== DATA RENTAL SEPEDA ===");
        System.out.println("ID Rental      : " + getIdRental());
        System.out.println("Nama Pelanggan : " + getNamaPelanggan());
        System.out.println("Jenis Sepeda   : " + getJenisSepeda());
        System.out.println("Jenis Rem      : " + jenisRem);
        System.out.println("Harga Sewa     : Rp" + getHargaSewa() + "/" + getSatuanSewa());
        System.out.println("Lama Sewa      : " + getLamaSewa() + " " + getSatuanSewa());
        System.out.println("Total Biaya    : Rp" + hitungTotal());
    }
}