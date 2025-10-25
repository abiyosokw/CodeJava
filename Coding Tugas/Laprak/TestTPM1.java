package Laprak;

import java.util.Scanner;

public class TestTPM1 {
    public static void main(String[] args) {
        String NIM, Prodi;
        Integer Tahun;
        Boolean Status;
        Double IPK;

        Scanner input =  new Scanner(System.in);

        System.out.print("Masukkan nama : ");
        String Nama = input.nextLine();

        System.out.print("Masukan NIM : ");
        NIM = input.nextLine();

        System.out.print("Masukan Tahun Angkatan : ");
        Tahun = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan Prodi : ");
        Prodi = input.nextLine();

        System.out.print("Status Aktif Mahasiswa : ");
        Status = input.nextBoolean();
        input.nextLine();

        System.out.print("Masukkan IPK : ");
        IPK = input.nextDouble();
        input.nextLine();

        System.out.println("\n== Data Mahasiswa ==");
        System.out.println("Nama : " +Nama+ "" );
        System.out.println("NIM : " +NIM+ "");
        System.out.println("Tahun Angkatan : " +Tahun+ "");
        System.out.println("Prodi : " +Prodi+ "");
        System.out.println("Status Aktif Mahasiswa : " +Status+ "");
        System.out.println("IPK : " +IPK);

        input.close();
    
    }
    
}