import java.util.Scanner;

public class SeleksiKondisi_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double D = Math.pow(b, 2) - (4 * a * c);
        if (D > 0) {
        // Dua akar real
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " dan " + r2);
        } else if (D == 0) {
        //satu akar real
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root " + r1);
        } else {
        //Tidak ada akar real
            System.out.println("The equation has no real roots");
        }

        input.close();
    }
}