package Laprak;

public class LAPRAK3B {
    public static void main(String[] args) {
        printA();
        System.out.println();
        printB();
        System.out.println();
        printC();
        System.out.println();
    }

    public static void printA() {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 && j < n && j > 0 ||
                    i == n/2 ||
                    j == 1 ||
                    j == n) 
                    {
                    System.out.print("A ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printB() {
       int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 ||
                    (i == 0 && j < n - 1) ||
                    (i == n/2 && j < n - 1) ||
                    (i == n-1 && j < n - 1) ||
                    (j == n - 1 && i != 0 && i != n/2 && i != n - 1)
                ) {
                    System.out.print("B ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printC() {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n/2 || i == 0 || i == n-1)
                {
                    System.out.print("I ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
