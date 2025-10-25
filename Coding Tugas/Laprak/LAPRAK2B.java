package Laprak;

import java.util.Scanner;

public class LAPRAK2B {
    public static void main(String[] args) {
        System.out.println("Indeks Massa Tubuh (IMT)");
        System.out.printf("Masukkan berat badan (kg) : ");
        Scanner input = new Scanner(System.in);
        double berat = input.nextDouble();
        System.out.printf("masukkan tinggi badan (m) : ");
        double tinggi = input.nextDouble();
        double IMT = berat / (Math.pow(tinggi, 2));
        if (IMT < 18.5) {
            System.out.println("IMT = " + IMT + ", Termasuk kurus");
            } else if  (IMT <= 25 && IMT >= 18.5) {
                System.out.println("IMT = " + IMT + ", Termasuk normal");
            } else if (IMT <= 30 && IMT >= 25) {
                System.out.println("IMT = " + IMT + ", Termasuk gemuk");
            } else if (IMT >= 30) {
                System.out.println("IMT = " + IMT + ", Termasuk kegemukan");
        input.close();
        }
     }
 }