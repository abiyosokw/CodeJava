package UTP;
import java.util.*;

public class utp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] kursi = new boolean[n][m];
        int harga = -1;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                kursi[i][j] = sc.nextBoolean();
            }
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        
        for (int k = 0; k < q; k++) {
            String perintah = sc.nextLine().trim();
            String[] bagian = perintah.split(" ");
            String pilihan = bagian[0];
            
            switch (pilihan) {
            case "CEK_KURSI":
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++) {
                        if (kursi[i][j]) {
                            System.out.print("X ");
                        } else {
                            System.out.print("O ");
                        }
                    }
                    System.out.println();
                }
                break;
                
            case "HITUNG_PENDAPATAN":
                if (harga == -1) {
                    System.out.println("Harga kursi belum ditetapkan!");
                } else {
                    int hitung = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (kursi[i][j]) hitung++;
                        }
                    }
                    System.out.println("Pendapatan: " + (hitung * harga));
                }
                break;
                
            case "KOSONGKAN":
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        kursi[i][j] = false;
                    } 
                }
                System.out.println("Semua kursi telah dikosongkan.");
                break;
                
            case "SETHARGA":
                String[] setHarga = perintah.split("\\s+");
                harga = Integer.parseInt(setHarga[1]);
                System.out.println("Harga kursi diubah menjadi " + harga + ".");
                break;
                
            case "PESAN":
                String[] pesan = perintah.split(" ");
                int r = Integer.parseInt(pesan[1])-1;
                int c = Integer.parseInt(pesan[2])-1;
                
                if (kursi[r][c]) {
                    System.out.println("Kursi baris " + (r+1) + " kolom " + (c+1) + " sudah dipesan sebelumnya!");
                } else {
                    kursi[r][c] = true;
                    System.out.println("Kursi baris " + (r+1) + " kolom " + (c+1) + " berhasil dipesan.");
                }
                break;
            
            default:
                System.out.println("Perintah tidak dikenali: " + pilihan);
            }
        }
    }
}