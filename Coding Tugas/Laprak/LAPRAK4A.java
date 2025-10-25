package Laprak;
import java.util.Scanner;

public class LAPRAK4A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array berisi pilihan menu
        String[] menu = {
            "1. Input Data",
            "2. Lihat Data",
            "3. Average",
            "4. Sum",
            "5. Max",
            "6. Min",
            "7. Keluar"
        };

        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            
            // Loop array untuk menampilkan menu
            for (String m : menu) {
                System.out.println(m);
            }

            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();

            // Hanya contoh tampilan (belum ada isi)
            if (pilihan >= 1 && pilihan <= 7) {
                System.out.println("Anda memilih: " + menu[pilihan - 1]);
            } else {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 7);

        System.out.println("Program selesai.");
    }
}