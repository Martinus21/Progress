package com.vocalKonsonan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat Object
        vocal obj_Vocal = new vocal();
        konsonan obj_Konsonan = new konsonan();

        // Deklarasi
        String word;

        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        word = scanner.nextLine();

        //mengembalikan nilai int
        obj_Vocal.vokal = obj_Vocal.num_vokal(word);
        obj_Konsonan.konsonan = obj_Konsonan.num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +obj_Vocal.vokal);
        System.out.println("Jumlah huruf konsonan : " +obj_Konsonan.konsonan);
    }
}

class vocal {
    int vokal = 0;

    int num_vokal(String word) {
        int i;
        int jumlah_vokal = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }
}

class konsonan extends vocal {
    int konsonan = 0;

    int num_konsonan(String word) {
        int i;
        int jumlah_konsonan = 0;

        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o' && word.charAt(i) != ' ') {
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}