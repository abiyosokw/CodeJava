package Method;

import java.util.Scanner;

public class Method_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input string dari user
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // panggil method konversi
        String converted = convertToPhoneNumber(s);

        // tampilkan hasil
        System.out.println(converted);
    }

    // method untuk mengubah seluruh string
    public static String convertToPhoneNumber(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                result.append(getNumber(ch)); // panggil method getNumber
            } else {
                result.append(ch); // kalau bukan huruf, biarkan
            }
        }

        return result.toString();
    }

    // method untuk mengubah huruf → angka sesuai keypad
    public static int getNumber(char uppercaseLetter) {
        uppercaseLetter = Character.toUpperCase(uppercaseLetter);

        if ("ABC".indexOf(uppercaseLetter) >= 0) return 2;
        else if ("DEF".indexOf(uppercaseLetter) >= 0) return 3;
        else if ("GHI".indexOf(uppercaseLetter) >= 0) return 4;
        else if ("JKL".indexOf(uppercaseLetter) >= 0) return 5;
        else if ("MNO".indexOf(uppercaseLetter) >= 0) return 6;
        else if ("PQRS".indexOf(uppercaseLetter) >= 0) return 7;
        else if ("TUV".indexOf(uppercaseLetter) >= 0) return 8;
        else if ("WXYZ".indexOf(uppercaseLetter) >= 0) return 9;

        return -1; // kalau bukan huruf
    }
}
