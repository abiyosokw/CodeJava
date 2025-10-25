package UTP;
import java.util.*;

public class utp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahNama;
        String[] nama;
        String[] namaAsli;
        int totalHuruf = 0;
        String[] bagian;
        String inisial;
        String awalan;
        StringBuilder namaProper = new StringBuilder();
        String namaFinal;
        jumlahNama = sc.nextInt();
        sc.nextLine();
        nama = new String[jumlahNama];
        namaAsli = new String[jumlahNama];
        for (int i = 0; i < jumlahNama; i++) {
            namaAsli[i] = sc.nextLine();
            nama[i] = namaAsli[i];
        }
        awalan = sc.nextLine().trim();
        awalan = awalan.substring(0,1).toUpperCase();
        for (int i = 0; i < jumlahNama; i++) {
            namaProper.setLength(0);
            bagian = nama[i].trim().split("\\s+");
            for (int j = 0; j < bagian.length; j++){
                if (bagian[j].length() == 0) continue;
                namaProper.append(Character.toUpperCase(bagian[j].charAt(0)));
                if (bagian[j].length() > 1) {
                    namaProper.append(bagian[j].substring(1).toLowerCase());
                }
                if (j < bagian.length - 1) {
                    namaProper.append(" ");
                }
            }
            namaFinal = namaProper.toString();
            nama[i] = namaFinal;
        }
        System.out.println("Masukkan " + jumlahNama + " nama lengkap:");
        for (int i = 0; i < jumlahNama; i++) {
            System.out.println("Nama ke-" + (i + 1) +":");
        }
        System.out.println();
        System.out.println("Inisial dari setiap nama:");
        for(int i = 0; i < jumlahNama; i++) {
            bagian = nama[i].split("\\s+");
            inisial = "";
            for (int j = 0; j < bagian.length; j++){
                inisial += Character.toUpperCase(bagian[j].charAt(0));
                inisial += ".";
            }
            System.out.println(namaAsli[i] + " -> " + inisial);
        }
        System.out.println();
        System.out.println("Nama yang berawalan huruf '" +awalan+ "':");
        int count = 0;
        for (int i  = 0; i < jumlahNama; i++) {
            if (nama[i].length() > 0 && Character.toUpperCase(nama[i].charAt(0)) == awalan.charAt(0)) {
                System.out.println(nama[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Tidak ada nama yang berawalan '" + awalan + "'");
        }
        for (int i = 0; i < jumlahNama; i++) {
            for (int j = 0; j < nama[i].length(); j++) {
                if (nama[i].charAt(j) != ' ') totalHuruf++;
            }
        }
        System.out.println();
        System.out.println("Total huruf (tanpa spasi): " + totalHuruf);
    }
}