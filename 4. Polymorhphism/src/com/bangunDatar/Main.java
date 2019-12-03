package com.bangunDatar;

import java.util.Scanner;

public class Main {
    private static char pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int s1, s2, r;

        Lingkaran oprasi_lngkaran = new Lingkaran();
        PersegiPanjang oprasi_persegiPanjang = new PersegiPanjang();
        PersegiTiga oprasi_persegiTiga = new PersegiTiga();

        /*Program*/
        //panggil metode
        mainMenu();
        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case '1':{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + oprasi_persegiPanjang.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + oprasi_persegiPanjang.keliling(s1,s2));
                break;
            }
            case '2':{
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + oprasi_persegiTiga.luas(s1,s2));
                System.out.println("Keliling segitiga: " + oprasi_persegiTiga.keliling(s1,s2));
                break;
            }
            case '3':{
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + oprasi_lngkaran.luas(r));
                System.out.println("Keliling lingkaran: " + oprasi_lngkaran.keliling(r));
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                break;
            }
        }
    }

    private static void mainMenu(){
        //pilihan menu
        System.out.println("====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.next().charAt(0);
    }
}
