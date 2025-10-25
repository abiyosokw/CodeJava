package array;

import java.util.Scanner;

public class Array_7_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Input dari user
        System.out.print("Enter the number of balls to drop: ");
        int balls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        int slotCount = input.nextInt();

        // 2. Array untuk menyimpan jumlah bola yang jatuh di tiap slot
        int[] slots = new int[slotCount];

        // 3. Simulasi jatuhnya setiap bola
        for (int i = 1; i <= balls; i++) {
            String path = "";   // untuk menyimpan jejak jalur (L dan R)
            int position = 0;   // posisi akhir bola, dimulai dari 0

            // 4. Simulasi pergerakan bola di setiap baris paku
            for (int j = 0; j < slotCount - 1; j++) {
                if (Math.random() < 0.5) {
                    path += "L"; // bola ke kiri
                    // posisi tidak berubah
                } else {
                    path += "R"; // bola ke kanan
                    position++;  // kalau ke kanan, posisi slot bertambah
                }
            }

            // 5. Cetak jalur bola
            System.out.println("Path  " + i + " : " + path);

            // 6. Masukkan bola ke slot yang sesuai
            slots[position]++;
        }

        // 7. Cari ketinggian maksimum slot untuk mencetak histogram
        int maxHeight = 0;
        for (int s : slots) {
            if (s > maxHeight) maxHeight = s;
        }

        // 8. Cetak histogram dari atas ke bawah
        for (int level = maxHeight; level > 0; level--) {
            for (int s = 0; s < slotCount; s++) {
                if (slots[s] >= level) {
                    System.out.print("|O|"); // bola ditampilkan
                } else {
                    System.out.print("| |"); // kosong
                }
            }
            System.out.println();
        }
        input.close();
    }
}