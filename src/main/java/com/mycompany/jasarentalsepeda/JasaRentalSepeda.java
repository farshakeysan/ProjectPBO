/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jasarentalsepeda;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class JasaRentalSepeda {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String idRental;
        String namaPelanggan;
        String jenisSepeda;
        String satuanSewa;
        int hargaSewa;
        int lamaSewa;

        System.out.println("=== JASA RENTAL SEPEDA ===");
        System.out.println();

        System.out.print("Masukkan ID Rental      : ");
        idRental = input.nextLine();

        System.out.print("Masukkan Nama Pelanggan : ");
        namaPelanggan = input.nextLine();

        System.out.print("Masukkan Jenis Sepeda   : ");
        jenisSepeda = input.nextLine();

        System.out.println();
        System.out.println("Pilih Satuan Sewa:");
        System.out.println("1. Jam");
        System.out.println("2. Hari");
        System.out.print("Pilihan                : ");
        int pilihan = input.nextInt();

        if (pilihan == 1) {
            satuanSewa = "jam";
        } else {
            satuanSewa = "hari";
        }

        System.out.print("Masukkan Harga Sewa    : Rp");
        hargaSewa = input.nextInt();

        System.out.print("Masukkan Lama Sewa     : ");
        lamaSewa = input.nextInt();

        Rental rental1 = new Rental(
            idRental,
            namaPelanggan,
            jenisSepeda,
            hargaSewa,
            lamaSewa,
            satuanSewa
        );

        rental1.tampilkanData();

        System.out.println();
        System.out.println("=== DATA DARI GETTER ===");
        System.out.println("ID Rental      : " + rental1.getIdRental());
        System.out.println("Nama Pelanggan : " + rental1.getNamaPelanggan());
        System.out.println("Jenis Sepeda   : " + rental1.getJenisSepeda());
        System.out.println("Harga Sewa     : Rp" + rental1.getHargaSewa());
        System.out.println("Lama Sewa      : " + rental1.getLamaSewa());
        System.out.println("Satuan Sewa    : " + rental1.getSatuanSewa());

        System.out.println();
        System.out.println("=== SIMULASI SETTER ===");

        System.out.println("Mengubah nama pelanggan...");
        rental1.setNamaPelanggan("Farsha Keysan Aryadi");
        System.out.println("Nama baru      : " + rental1.getNamaPelanggan());

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