package Laprak;
import java.util.Scanner;

public class LAPRAK3A {
    public static void main(String[] args) {
        // memulai scanner
        Scanner sc = new Scanner(System.in);
        // meminta input n
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt(); 
        // looping untuk baris
        for (int i = 1; i <= n; i++) {
            // looping untuk spasi
            for (int j = 1; j <= (n - i); j++) {  
            // Spasi sebanyak (n - i)
            System.out.print(" ");
        }
            // looping untuk bintang
            for (int k = 1; k <= i; k++) {  
            // Bintang sebanyak i
            System.out.print("*");
        }
        System.out.println();
        }
        sc.close();
    }
}
