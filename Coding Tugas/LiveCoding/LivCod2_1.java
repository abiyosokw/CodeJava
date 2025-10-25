package LiveCoding;

import java.util.Scanner;

public class LivCod2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n == 0 || m == 0) {
            System.out.println("Wowo bingung, matriksnya kosong");
            sc.close();
            return;
        }

        int[][] matriks = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriks[i][j] = sc.nextInt();
            }
        }

        int atas = 0, bawah = n - 1, kiri = 0, kanan = m - 1;
        String hasil = "";

        while (atas <= bawah && kiri <= kanan) {
            for (int i = kiri; i <= kanan; i++) hasil += matriks[atas][i] + " ";
            atas++;

            for (int i = atas; i <= bawah; i++) hasil += matriks[i][kanan] + " ";
            kanan--;

            if (atas <= bawah) {
                for (int i = kanan; i >= kiri; i--) hasil += matriks[bawah][i] + " ";
                bawah--;
            }

            if (kiri <= kanan) {
                for (int i = bawah; i >= atas; i--) hasil += matriks[i][kiri] + " ";
                kiri++;
            }
        }

        System.out.println(hasil);
        sc.close();
    }
}