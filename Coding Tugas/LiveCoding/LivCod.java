package LiveCoding;
import java.util.Scanner;

public class LivCod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // fungsi nya untuk menampilkan N
        String hasil = "";
        System.out.println("Masukkan angka : ");
        int N = sc.nextInt();

        // cek kelipatan
        if (N % 2 == 0 ) hasil += "das";
        if (N % 3 == 0 ) hasil += "dis";
        if (N % 5 == 0 ) hasil += "dus";
        if (N % 7 == 0 ) hasil += "des";
        if (N % 11 == 0 ) hasil += "dos";
        // cek hasil

        // Ini menunjukan jika hasil tidak menghasilkan kata dari atas maka akan menampilkan N
        if (hasil.isBlank()) {
            System.out.println(N);
        } else {
            System.out.println(hasil);
        }
        sc.close();
    } 
}
