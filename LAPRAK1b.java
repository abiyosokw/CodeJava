import java.util.Scanner;

public class Test1b {
    public static void main(String[] args) {
        String Nama, Kelurahan;
        int posisiawal, posisiakhir, biayabeban, PJJ, pemakaian, tarifListrik, tarifPJJ, Total;

        System.out.println("Program penghitung pemakaian listrik sederhana");

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        Nama = input.nextLine();

        System.out.print("Kelurahan : ");
        Kelurahan = input.nextLine();

        System.out.print("Masukkan posisi awal Kwh Meter : ");
        posisiawal = input.nextInt();

        System.out.print("Masukkan posisi akhir Khw Meter : ");
        posisiakhir = input.nextInt();

        System.out.print("Masukkan biaya beban saat ini : ");
        biayabeban = input.nextInt();

        System.out.print("Masukkan PPJ (dalam persen) : ");
        PJJ = input.nextInt();

        pemakaian = posisiakhir - posisiawal;
        tarifListrik = biayabeban * pemakaian;
        tarifPJJ = tarifListrik * PJJ / 100;
        Total = tarifListrik + tarifPJJ;

        System.out.println("===================PLN Java===================");
        System.out.println("Nama : " +Nama);
        System.out.println("Kelurahan : " +Kelurahan);
        System.out.println("Pemakaian bulan ini : " +pemakaian+ " Kwh Meter");
        System.out.println("Tarif Listrik : Rp " +tarifListrik+ ",-");
        System.out.println("PPJ "+PJJ+ "% : Rp " +tarifPJJ+ ",-");
        System.out.println("Total Bayar : Rp" +Total+ ",-");
        System.out.println("==============================================");

        input.close();
    }
}
