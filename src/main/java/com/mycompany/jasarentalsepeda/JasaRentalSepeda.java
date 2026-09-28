package com.mycompany.jasarentalsepeda;

import java.util.Scanner;

public class JasaRentalSepeda extends Rental {

    private String jenisRem;

    public JasaRentalSepeda(String idRental, String namaPelanggan,
                            String jenisSepeda, int hargaSewa,
                            int lamaSewa, String satuanSewa,
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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== JASA RENTAL SEPEDA ===");
        System.out.println();

        System.out.print("Masukkan ID Rental      : ");
        String idRental = input.nextLine();

        System.out.print("Masukkan Nama Pelanggan : ");
        String namaPelanggan = input.nextLine();

        System.out.print("Masukkan Jenis Sepeda   : ");
        String jenisSepeda = input.nextLine();

        System.out.print("Masukkan Jenis Rem      : ");
        String jenisRem = input.nextLine();

        System.out.println();
        System.out.println("Pilih Satuan Sewa:");
        System.out.println("1. Jam");
        System.out.println("2. Hari");
        System.out.print("Pilihan                 : ");
        int pilihan = input.nextInt();

        String satuanSewa;

        if (pilihan == 1) {
            satuanSewa = "jam";
        } else {
            satuanSewa = "hari";
        }

        System.out.print("Masukkan Harga Sewa     : Rp");
        int hargaSewa = input.nextInt();

        System.out.print("Masukkan Lama Sewa      : ");
        int lamaSewa = input.nextInt();

        JasaRentalSepeda rental1 = new JasaRentalSepeda(
                idRental,
                namaPelanggan,
                jenisSepeda,
                hargaSewa,
                lamaSewa,
                satuanSewa,
                jenisRem
        );

        rental1.tampilkanData();

        System.out.println();
        System.out.println("=== DATA DARI GETTER ===");
        System.out.println("ID Rental      : " + rental1.getIdRental());
        System.out.println("Nama Pelanggan : " + rental1.getNamaPelanggan());
        System.out.println("Jenis Sepeda   : " + rental1.getJenisSepeda());
        System.out.println("Jenis Rem      : " + rental1.getJenisRem());
        System.out.println("Harga Sewa     : Rp" + rental1.getHargaSewa());
        System.out.println("Lama Sewa      : " + rental1.getLamaSewa());
        System.out.println("Satuan Sewa    : " + rental1.getSatuanSewa());

        System.out.println();
        System.out.println("=== SIMULASI SETTER ===");

        System.out.println("Mengubah nama pelanggan...");
        rental1.setNamaPelanggan("Farsha Keysan Aryadi");
        System.out.println("Nama baru      : " + rental1.getNamaPelanggan());

        System.out.println();
        System.out.println("Mengubah jenis rem...");
        rental1.setJenisRem("Hydraulic Disc Brake");
        System.out.println("Jenis rem baru : " + rental1.getJenisRem());

        System.out.println();
        System.out.println("Mengubah lama sewa menjadi 3...");
        rental1.setLamaSewa(3);
        System.out.println("Lama sewa baru : " + rental1.getLamaSewa());

        System.out.println();
        System.out.println("Mengubah lama sewa menjadi 0...");
        rental1.setLamaSewa(0);
        System.out.println("Lama sewa saat ini : " + rental1.getLamaSewa());

        System.out.println();
        System.out.println("=== DATA SETELAH PERUBAHAN ===");
        rental1.tampilkanData();

        input.close();
    }
}