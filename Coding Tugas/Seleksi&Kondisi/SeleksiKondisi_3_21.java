import java.util.Scanner;

public class SeleksiKondisi_3_21 {
    public static void main(String[] args) {
        // Program untuk menentukan hari dalam seminggu berdasarkan tanggal, bulan, dan tahun tertentu
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year (e.g., 2020) : ");
        int tahun = input.nextInt();
        System.out.println("Enter month (1-12) : ");
        int bulan = input.nextInt();
        System.out.println("Enter the day of the month (1-31) : ");
        int tanggal = input.nextInt();

        // Adjust bulan and tahun for Zeller's Congruence
        if (bulan == 1) {
            bulan = 13;
            tahun--;
        } else if (bulan == 2) {
            bulan = 14;
            tahun--;
        }

        // Zeller's Congruence rumus untuk menghitung the day of the week
        Integer hari = (bulan + (26 * (bulan + 1) / 10) + (tahun % 100) + (tahun % 100) / 4 + (tahun / 100) / 4 + 5 * (tahun / 100)) % 7;
        switch (hari) {
            case 0:
                System.out.println("Day of the week is Saturday");  
                break;
            case 1:
                System.out.println("Day of the week is Sunday");
                break;
            case 2:
                System.out.println("Day of the week is Monday");
                break;
            case 3:
                System.out.println("Day of the week is Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is Thursday");
                break;
            case 6:
                System.out.println("Day of the week is Friday");
                break;
            default:
                break;
        }
        input.close();
    }
}