package Laprak;
import java.util.Scanner;

public class LAPRAK4B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array 2D berisi data kereta api
        String[][] menu = {
            { "Ekonomi", "50000", "2%", "Tidak ada", "Tidak ada" },
            { "Bisnis", "100000", "5%", "Ada", "Tidak ada" },
            { "Eksekutif", "200000", "7%", "Ada", "Tidak ada" },
            { "Parawisata", "300000", "10%", "Ada", "Ada" },
        };
        // Jika belum ada pesanan
        String pesanan = "Belum ada pesanan";

int pilihan;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1: // Lihat semua
                    System.out.println("\nDaftar Kereta Api:");
                    System.out.printf("%-12s %-12s %-12s %-12s %-12s%n",
                                      "Jenis", "Harga", "Diskon", "AC", "Colokan");
                    for (String[] row : menu) { 
                        System.out.printf("%-12s %-12s %-12s %-12s %-12s%n",
                                          row[0], row[0], row[0], row[3], row[4]);
                    }
                    break;

                case 2: // Ada AC
                    System.out.println("\nKereta yang ada AC:");
                    for (String[] row : menu) {
                        if (row[3].equalsIgnoreCase("Ada")) {
                            System.out.println(row[0] + " - Harga: " + row[1]);
                        }
                    }
                    break;

                case 3: // Ada Colokan
                    System.out.println("\nKereta yang ada Colokan:");
                    for (String[] row : menu) {
                        if (row[4].equalsIgnoreCase("Ada")) {
                            System.out.println(row[0] + " - Harga: " + row[1]);
                        }
                    }
                    break;

                case 4: // Pesan tiket
                    System.out.println("\nPilih kereta yang ingin dipesan:");
                    for (int i = 0; i < menu.length; i++) {
                        System.out.println((i+1) + ". " + menu[i][0] + " - Harga: " + menu[i][1]);
                    }
                    System.out.print("Masukkan nomor kereta: ");
                    int pilihKereta = sc.nextInt();
                    if (pilihKereta >= 1 && pilihKereta <= menu.length) {
                        pesanan = menu[pilihKereta-1][0] + " (Harga " + menu[pilihKereta-1][1] + ")";
                        System.out.println("Pesanan berhasil disimpan!");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    break;

                case 5: // Lihat pesanan
                    System.out.println("\nPesanan Tiket Anda: " + pesanan);
                    break;

                case 0:
                    System.out.println("Sudah tah yorobun? Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}