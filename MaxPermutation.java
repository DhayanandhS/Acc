import java.math.BigInteger;
import java.util.*;

public class MaxPermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine(); // Properly read each string
        }
        System.out.println("Input strings: " + Arrays.toString(arr));
        BigInteger result = maxper(arr);
        System.out.println(result);
    }

    private static BigInteger maxper(String[] arr) {
        BigInteger maxFactorial = BigInteger.ZERO;
        for (String s : arr) {
            String novowel = remove(s);
            BigInteger factorialValue = factorial(novowel.length());
            if (factorialValue.compareTo(maxFactorial) > 0) {
                maxFactorial = factorialValue;
            }
        }
        return maxFactorial;
    }

    private static BigInteger factorial(int length) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= length; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    private static String remove(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}

