package Laprak;

import java.util.Scanner;

public class LAPRAK1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer angka1, angka2;

        System.out.print("Masukkan operator pertama : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan operator kedua : ");
        angka2 = input.nextInt();
        
        Integer tambah = angka1 + angka2;
        Integer kurang = angka1 - angka2;
        Integer kali = angka1 * angka2;
        Double bagi = (double) (angka1/angka2);

        System.out.print("Hasil penjumlahan : " +tambah+ "\n");
        System.out.print("Hasil pengurangan : " +kurang+ "\n");
        System.out.print("Hasil perkalian : " +kali+ "\n");
        System.out.print("Hasil pembagian : " +bagi);

        input.close();
    }
}