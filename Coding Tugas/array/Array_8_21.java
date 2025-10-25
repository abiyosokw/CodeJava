package array;

import java.util.Scanner;

public class Array_8_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("No cities given.");
            return;
            
        }

        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Enter the coordinates of the cities (x y pairs):");
        // Scanner.nextDouble akan membaca angka terlepas dari baris/spasi, jadi
        // input bisa ditulis dalam satu baris atau beberapa baris.
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
            y[i] = scanner.nextDouble();
        }

        int centralIndex = findCentralCity(x, y);
        double totalDist = totalDistance(centralIndex, x, y);

        System.out.printf("The central city is at (%.2f, %.2f)%n", x[centralIndex], y[centralIndex]);
        System.out.printf("The total distance to all other cities is %.2f%n", totalDist);

        scanner.close();
    }

    // Cari indeks kota yang memiliki total jarak terkecil ke kota lain
    static int findCentralCity(double[] x, double[] y) {
        int bestIndex = -1;
        double bestSum = Double.POSITIVE_INFINITY;
        for (int i = 0; i < x.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < x.length; j++) {
                sum += distance(x[i], y[i], x[j], y[j]);
            }
            if (sum < bestSum) {
                bestSum = sum;
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    // Menghitung total jarak dari indeks tertentu ke semua kota
    static double totalDistance(int index, double[] x, double[] y) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += distance(x[index], y[index], x[i], y[i]);
        }
        return sum;
    }

    // Jarak Euclidean antara dua titik (x1,y1) dan (x2,y2)
    static double distance(double x1, double y1, double x2, double y2) {
        double dx = x1 - x2;
        double dy = y1 - y2;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
