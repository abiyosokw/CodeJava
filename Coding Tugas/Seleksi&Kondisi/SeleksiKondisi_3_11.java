import java.util.Scanner;

public class SeleksiKondisi_3_11 {
    public static void main(String[] args) {
        // Program untuk menentukan jumlah hari dalam suatu bulan tertentu pada tahun tertentu
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan bulan : ");
        int bulan = input.nextInt();
        System.out.println("Masukkan tahun : ");
        int tahun = input.nextInt();

        // Inisialisasi variabel untuk nama bulan dan jumlah hari
        String namaBulan = "";
        int jumlahHari = 0;

        // Menentukan nama bulan dan jumlah hari berdasarkan input bulan dan tahun
        switch (bulan) {
            case 1:
                namaBulan = "Januari";
                jumlahHari = 31;
                break;
            case 2:
                namaBulan = "Februari";
                // Cek apakah tahun kabisat
                if (tahun % 4 == 0 && tahun % 100 != 0 || tahun % 400 == 0) {
                    jumlahHari = 29;
                } else {
                    jumlahHari = 28;
                }
                break;
            case 3:
                namaBulan = "Maret";
                jumlahHari = 31;
                break;
            case 4:
                namaBulan = "April";
                jumlahHari = 30;
                break;
            case 5:
                namaBulan = "Mei";
                jumlahHari = 31;
                break;
            case 6:
                namaBulan = "Juni";
                jumlahHari = 30;
                break;
            case 7:
                namaBulan = "Juli";
                jumlahHari = 31;    
                break;
            case 8:
                namaBulan = "Agustus";
                jumlahHari = 31;
                break;
            case 9:
                namaBulan = "September";
                jumlahHari = 30;
                break;
            case 10:
                namaBulan = "Oktober";
                jumlahHari = 31;
                break;
            case 11:
                namaBulan = "November";
                jumlahHari = 30;
                break;
            case 12:
                namaBulan = "Desember";
                jumlahHari = 31;
                break;
            default:
                System.out.println("Bulan tidak valid");
                break;
        }   // Akhir switch
        if (jumlahHari != 0) {
            System.out.println(namaBulan + " " + tahun + " memiliki " + jumlahHari + " hari.");
        }

        input.close();
    }
}