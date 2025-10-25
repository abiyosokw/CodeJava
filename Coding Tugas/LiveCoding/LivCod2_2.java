package LiveCoding;

import java.util.Scanner;

    public class LivCod2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] pengeluaran = new int[n];
        
        int Hemat = 0;
        int Normal = 0;
        int Boros = 0;
        int total = 0;
        
        int maxPengeluaran = pengeluaran[0];
        int minPengeluaran = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            pengeluaran[i] = sc.nextInt();
            
            // Menghitung kategori
            if (pengeluaran[i] < 50000) {
                Hemat++;
            } else if (pengeluaran[i] >= 50000 && pengeluaran[i] <= 100000) {
                Normal++;
            } else {
                Boros++;
            }
            
            // Total pengeluaran
            total += pengeluaran[i];
            
            // Cari pengeluaran tertinggi dan terendah
            if (pengeluaran[i] > maxPengeluaran) {
                maxPengeluaran = pengeluaran[i];
            }
            if (pengeluaran[i] < minPengeluaran) {
                minPengeluaran = pengeluaran[i];
            }
        }
        
        // Output hasil
        System.out.println(Hemat);
        System.out.println(Normal);
        System.out.println(Boros);
        System.out.println(total);
        System.out.println(maxPengeluaran + " " + minPengeluaran);
        
        sc.close();
    }
}