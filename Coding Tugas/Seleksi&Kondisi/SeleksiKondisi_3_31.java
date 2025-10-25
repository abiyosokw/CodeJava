import java.util.Scanner;

public class SeleksiKondisi_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Program untuk mengkonversi mata uang antara dolar dan RMB
        System.out.println("Masukkan nilai tukar dari dolar ke RMB: ");
        Double nilaiTukar = input.nextDouble();
        // Menampilkan menu konversi
        System.out.println("Pilih menu konversi: \n1. Dari Dolar ke RMB \n2. Dari RMB ke Dolar");
        Integer Prompt = input.nextInt();
        switch (Prompt) {
            case 1:
            // Konversi dari Dolar ke RMB
                System.out.println("Masukkan jumlah uang dalam dolar: ");
                Double jumlahDolar = input.nextDouble();
                Double hasilRMB = jumlahDolar * nilaiTukar;
                System.out.println("Hasil konversi: " + hasilRMB + " RMB");
                break;
            case 2:
            // Konversi dari RMB ke Dolar
                System.out.println("Masukkan jumlah uang dalam RMB: ");
                Double jumlahRMB = input.nextDouble();
                Double hasilDolar = jumlahRMB / nilaiTukar;
                System.out.println("Hasil konversi: " + hasilDolar + " Dolar");
                break;
        
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        input.close();
    }
}
