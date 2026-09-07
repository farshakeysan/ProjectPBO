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

        input.close();
    }
}