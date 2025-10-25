package Laprak;
import java.util.Scanner;

public class LAPRAK3C {
    public static void main(String[] args) {
    int pilihan;

    do {
       Scanner sc = new Scanner (System.in);
       System.out.println("MENU\n");
       System.out.println("0. KELUAR");
       System.out.println("1. HITUNG VOLUME BALOK");
       System.out.println("2. HITUNG VOLUME BOLA");
       System.out.println("3. HITUNG VOLUME KERUCUT");
       System.out.println("4. HITUNG VOLUME SILINDER");
       System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA\n");
       System.out.print("MASUKKAN PILIHAN ANDA: ");
       pilihan = sc.nextInt();
       sc.nextLine();
     
       switch (pilihan) {
        case 1:
            System.out.print("Masukkan panjang: ");
            double panjang = sc.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lebar = sc.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tinggi = sc.nextDouble();
            double volumeBalok = panjang * lebar * tinggi;
            System.out.println("Volume Balok: " + volumeBalok);
            break;
        case 2:
            System.out.print("Masukkan jari-jari: ");
            double jariJari = sc.nextDouble();
            double volumeBola = (4/3) * Math.PI * Math.pow(jariJari, 3);
            System.out.println("Volume Bola: " + volumeBola);
            break;
        case 3:
            System.out.print("Masukkan jari-jari: ");
            double rKerucut = sc.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tKerucut = sc.nextDouble();
            double volumeKerucut = (1/3) * Math.PI * Math.pow(rKerucut, 2) * tKerucut;
            System.out.println("Volume Kerucut: " + volumeKerucut);
            break;
        case 4:
            System.out.print("Masukkan jari-jari: ");
            double rSilinder = sc.nextDouble();
            System.out.print("Masukkan tinggi: ");
            double tSilinder = sc.nextDouble();
            double volumeSilinder = Math.PI * Math.pow(rSilinder, 2) * tSilinder;
            System.out.println("Volume Silinder: " + volumeSilinder);
            break;
        case 5:
            System.out.print("Masukkan alas segitiga (base): ");
            double alasSegitiga = sc.nextDouble();
            System.out.print("Masukkan tinggi segitiga: ");
            double tinggiSegitiga = sc.nextDouble();
            System.out.print("Masukkan tinggi limas: ");
            double tinggiLimas = sc.nextDouble();
            double volumeLimas = (1/3) * alasSegitiga * tinggiSegitiga * tinggiLimas;
            System.out.println("Volume Limas Segitiga: " + volumeLimas);
            break;
        default:
            break;
       }
    } while (pilihan != 0);
    System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
