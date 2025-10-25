package Laprak;

import java.util.Scanner;

public class LAPRAK2A {
    public static void main(String[] args) {
    // Tuliskan kode program Anda di sini
    System.out.println("Menu:");
    Scanner input = new Scanner(System.in);
    int number;
    do{
    // Menampilkan menu pilihan
     System.out.println("1. Menghitung luas dan keliling persegi panjang");
     System.out.println("2. Menghitung luas dan keliling lingkaran");
     System.out.println("3. Menghitung luas dan keliling segitiga");
     System.out.println("4. Exit");
     System.out.printf("\nMasukkan angka sesuai dengan pilihan : ");
     // Membaca input dari pengguna
    
     number = input.nextInt();
        input.nextLine();

    
    
     switch (number) {
        // Menghitung luas dan keliling persegi panjang
        case 1:
            System.out.println("Menghitung luas dan keliling persegi panjang");
            System.out.println("Masukkan panjang : ");
            double panjang = input.nextDouble();
            System.out.println("Masukkan lebar : ");
            double lebar = input.nextDouble();
            // Menghitung luas dan keliling persegi panjang
            double luasPersegiPanjang = panjang * lebar;
            double kelilingPersegiPanjang = 2 * (panjang + lebar);
            // Menampilkan hasil perhitungan
            System.out.println("Luas persegi panjang : " + luasPersegiPanjang);
            System.out.println("Keliling persegi panjang : " + kelilingPersegiPanjang);
            break;
        case 2:
            // Menghitung luas dan keliling lingkaran
            System.out.println("Menghitung luas dan keliling lingkaran");
            System.out.println("Masukkan jari-jari : ");
            double jarijari = input.nextDouble();
            // Menghitung luas dan keliling lingkaran
            double luasLingkaran = Math.PI * jarijari * jarijari;
            double kelilingLingkaran = 2 * Math.PI * jarijari;
            // Menampilkan hasil perhitungan
            System.out.println("Luas lingkaran : " + luasLingkaran);
            System.out.println("Keliling lingkaran : " + kelilingLingkaran);
            break;
        case 3:
            // Menghitung luas dan keliling segitiga
            System.out.println("Menghitung luas dan keliling segitiga");
            // Menampilkan pilihan jenis segitiga
            System.out.println("Pilih jenis segitiga (1. Sama sisi, 2. Sama kaki, 3. Siku-siku, 4. Sembarang) : ");
            int bentuk = input.nextInt();

            switch (bentuk) {
                case 1:
                    // Menghitung segitiga sama sisi
                    System.out.println("Menghitung segitiga sama sisi");
                    System.out.println("Masukkan alas :");
                    double alas1 = input.nextDouble();
                    System.out.println("masukkan tinggi :");
                    double tinggi1 = input.nextDouble();
                    double LuasSegitiga1 = 0.5 * alas1 * tinggi1;
                    double KelilingSegitiga1 = 3 * alas1;
                    System.out.println("Luas segitiga : " + LuasSegitiga1);
                    System.out.println("Keliling segitiga : " + KelilingSegitiga1);
                    break;
                case 2:
                    // Menghitung segitiga sama kaki
                    System.out.println("Menghitung segitiga sama kaki");
                    System.out.println("Masukkan alas :");
                    double alas2 = input.nextDouble();
                    System.out.println("masukkan tinggi :");
                    double tinggi2 = input.nextDouble();
                    double LuasSegitiga2 = 0.5 * alas2 * tinggi2;
                    double KelilingSegitiga2 = alas2 + (Math.sqrt(alas2 * alas2 + tinggi2 * tinggi2)) * 2;
                    System.out.println("Luas segitiga : " + LuasSegitiga2);
                    System.out.println("Keliling segitiga : " + KelilingSegitiga2);
                    break;
                case 3:
                    // Menghitung segitiga siku-siku
                    System.out.println("Menghitung segitiga siku-siku");
                    System.out.println("Masukkan alas :");
                    double alas3 = input.nextDouble();
                    System.out.println("masukkan tinggi :");
                    double tinggi3 = input.nextDouble();
                    double LuasSegitiga3 = 0.5 * alas3 * tinggi3;
                    double KelilingSegitiga3 = alas3 + tinggi3 + Math.sqrt(alas3 * alas3 + tinggi3 * tinggi3);
                    System.out.println("Luas segitiga : " + LuasSegitiga3);
                    System.out.println("Keliling segitiga : " + KelilingSegitiga3);
                    break;
                default:
                    // Menghitung segitiga sembarang
                    System.out.println("Jenis segitiga tidak valid");
                    break;
            }
            break;
        case 4:
            break;
        default:
            System.out.println("\nPilihan tidak valid");
            System.out.println("Silakan pilih nomor 1-4\n");
            break;
     }

    } while (number != 4);
    // Menangani pilihan yang tidak valid
            System.out.println("Exit program.");
     // Menutup scanner
    input.close();
}
}