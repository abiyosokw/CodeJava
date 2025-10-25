package Looping;

import java.util.Scanner;

public class Looping_5_41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers (jangan di awali dengan 0, dan harus di akhiri dengan 0): ");
        int number = sc.nextInt();
        int MAX = number;
        int count = 1;

        while (number != 0 ) {
            number = sc.nextInt();
            if (number > MAX) {
                MAX = number;
            } else if (number == MAX) {
                count++;        // tambah count
            }
            // kalau number < max → tidak melakukan apa-apa
        }


        System.out.println("The largest number is " + MAX);
        System.out.println("The occurrence count of the largest number is " + count);
        sc.close();
    }
}

