package Laprak;
import java.util.*;

public class LAPRAK5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Program Penghitung Kombinasi dan Permutasi");
            System.out.println("1. Menghitung Permutasi");
            System.out.println("2. Menghitung Kombinasi");
            System.out.println("3. Keluar");
            System.out.println("Masukkan pilihan anda: ");
            pilihan = sc.nextInt();
            System.out.println();
            int r = 0;
            int n = 0;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai n : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = sc.nextInt();
                    System.out.println("        n!                     ");
                    System.out.println("nPr = ------ = " + Permutasi(n, r));
                    System.out.println("      (n-r)!                   ");
                    System.out.println("Maka Hasil Permutasinya adalah : " + Permutasi(n,r) );
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan nilai n : ");
                    n = sc.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    r = sc.nextInt();
                    System.out.println("         n!                        ");
                    System.out.println("nCr = ----------- = " + Kombinasi(n,r));
                    System.out.println("    (n-r)! x r!                    ");
                    System.out.println("Maka Hasil Kombinasi adalah : " + Kombinasi(n,r));
                    System.out.println();
                    break;
                
                case 3:
                    System.out.println("Keluar!!");
                    break;

                default:
                System.out.println("Tidak ada di pilihan");
                System.out.println("Pilih nomor 1-3\n");
                break;
                
            }
        } while (pilihan != 3);
    }

    public static int faktorial(int n) {
        /*  
        int hasil = 1;
        for (int i = n; i > 0; i-- ) {
        hasil = n * (n-1);
        } return hasil; 
         */
        // cara lain kalau mau pakai rumus //
        if (n == 0|| n == 1) {
            return 1;
        } else {
            return n * faktorial(n-1);
        }
    }
    public static int Permutasi(int n, int r){
        int hasil = 0;
        hasil = faktorial(n) / faktorial(n-r);
        return hasil;
    }
    public static int Kombinasi(int n, int r){
        int hasil = 0;
        hasil = faktorial(n) / (faktorial(n-r) * faktorial(r));
        return hasil;
    }
}    
