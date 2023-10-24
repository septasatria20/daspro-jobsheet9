import java.util.Scanner;

public class SistemBookingMenu {
    public static void main(String[] args) {
      Scanner sc00 = new Scanner(System.in);

        int menu;
        
        System.out.println("--------Selamat datang di Menu KAI POLINEMA--------");

        String[] bil = new String[4];
        bil [0] = "1. Layanan Informasi Kereta";
        bil [1] = "2. Menu Pemesanan Kereta";
        bil [2] = "3. Bantuan (Call Center) KAI Polinema";
        
        for (int i = 0; i < 3; i++) {
        System.out.println(bil[i]);
        }

        System.out.println("Pilih Menu (ketik angka) : ");
        menu = sc00.nextInt();

        switch (menu) {
            case 1 :
            System.out.println("Anda telah masuk di Layanan Kereta KAI POLINEMA");
            System.out.println("Informasi apa yang anda butuhkan? (ketik angka)");
            System.out.println("1. Tentang KAI POLINEMA");
            System.out.println("2. Kereta Ekonomi");
            System.out.println("3. Kereta Bisnis");
            System.out.println("4. Kereta Eksekutif");
            break;
            case 2 :
            System.out.println("Anda telah masuk ke Layanan Pemesanan Kereta");
            System.out.println("Silahkan input data anda...");
            break;
            case 3 :
            System.out.println("Anda telah masuk di Layanan Call Center");
            System.out.println("Kontak Call Center Kami : ");
            System.out.println("Telepon (Fast Respon) : 085233698778");
            System.out.println("WhatssApp : 085233698778");
            System.out.println("Email : septasatria20@gmail.com");
            break;
            
            default:
            System.out.println("Maaf, input yang Anda masukkan salah ");
        }
    }
} 