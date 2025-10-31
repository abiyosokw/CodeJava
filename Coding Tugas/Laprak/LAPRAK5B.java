package Laprak;

import java.util.Scanner;

public class LAPRAK5B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengecek bilangan prima dari input user
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();
        if (isPrima(angka)) {
            System.out.println(angka + " adalah bilangan prima.");
        } else {
            System.out.println(angka + " bukan bilangan prima.");
        }

        // Menampilkan bilangan prima 1-100
        System.out.println("Bilangan prima dari 1 sampai 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Fungsi untuk mengecek bilangan prima
    public static boolean isPrima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}