package Looping;

import java.util.Scanner;

public class Looping_5_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter The CD Value : $");
        double Value = sc.nextDouble();
        System.out.print("Enter annual percentage yield : ");
        double Percentage = sc.nextDouble();
        double monthlyPercentage = Percentage / 1200;
        System.out.print("Enter number of months : ");
        int months = sc.nextInt();

        double temp = 0;
        for (int i = 1; i <= months; i++) {
            temp = Value + Value *  monthlyPercentage;
            System.out.printf("After month %d, the CD value is $%.2f\n", i, temp);
            Value = temp;
        }
        sc.close();
    }
}

