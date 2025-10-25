package Laprak;

import java.util.Scanner;

public class LAPRAK2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jam kerja : ");
        int jamKerja = input.nextInt();
        int gajiPerJam = 5000;
        int Gaji = jamKerja * gajiPerJam;
        int Denda = 0;
        int Lembur = 0;

        if (jamKerja > 60) {
            int GajiKerjaBaru = 6000;
            Lembur = (jamKerja - 60) * GajiKerjaBaru;
        } else if (jamKerja < 50) {
            int JamDenda = 50 - jamKerja;
            Denda = JamDenda * 1000;
        }
        int Total = Gaji + Lembur - Denda;

        System.out.printf("%-10s= Rp. %6d\n", "upah", Gaji);
        System.out.printf("%-10s= Rp. %6d\n", "Lembur", Lembur);
        System.out.printf("%-10s= Rp. %6d\n", "Denda", Denda);
        System.out.println("-----------------------");
        System.out.printf("%-10s= Rp. %6d\n", "Total", Total);
        
        input.close();
    }
}
