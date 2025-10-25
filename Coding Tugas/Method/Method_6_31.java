package Method;
import java.util.Scanner;

public class Method_6_31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();

        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int size = getSize(number);
        // check length
        if (size < 13 || size > 16) return false;

        // check prefix: 4 (Visa), 5 (Master), 37 (AmEx), 6 (Discover)
        if (!(prefixMatched(number, 4) ||
              prefixMatched(number, 5) ||
              prefixMatched(number, 37) ||
              prefixMatched(number, 6))) {
            return false;
        }

        // Luhn check
        int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return sum % 10 == 0;
    }

    /** Get the result from Step 2: double every second digit from right and sum digits */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        long n = number;
        int pos = 1; // position from right (1 = rightmost)
        while (n > 0) {
            int digit = (int)(n % 10);
            if (pos % 2 == 0) { // even position from right
                int doubled = digit * 2;
                sum += getDigit(doubled);
            }
            n /= 10;
            pos++;
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise
     *  return the sum of the two digits (e.g., getDigit(16) -> 7)
     */
    public static int getDigit(int number) {
        if (number < 10) return number;
        return number / 10 + number % 10; // works because number <= 18
    }

    /** Return sum of odd-place digits in number (from right) */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        long n = number;
        int pos = 1;
        while (n > 0) {
            int digit = (int)(n % 10);
            if (pos % 2 == 1) { // odd position from right
                sum += digit;
            }
            n /= 10;
            pos++;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        int k = getSize(d);
        long prefix = getPrefix(number, k);
        return prefix == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        // handle 0 explicitly
        if (d == 0) return 1;
        int count = 0;
        long n = Math.abs(d);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    /** Return the first k number of digits from number.
     *  If the number of digits in number is less than k, return number.
     */
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        if (size <= k) return number;

        int diff = size - k;
        long result = number;
        for (int i = 0; i < diff; i++) {
            result /= 10;
        }
        return result;
    }
}
