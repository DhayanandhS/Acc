import java.util.HashMap;
import java.util.Map;

// These lines import the necessary classes. 
// HashMap is used to store previously computed Fibonacci values, and Map is the interface for HashMap.

public class SpecialFibonacci {
    
    // Memoization map to store computed Fibonacci values
    static Map<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        int n = 10; // Example input
        System.out.println(fibonacci(n)); // Compute the special Fibonacci
    }
    
    static int fibonacci(int n) {
        // Base cases
        if (n < 2) {
            return n;
        }
        
        // Check if result is already in memo
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        
        // Compute the special Fibonacci value and store it in the memo map
        int result = (fibonacci(n - 1) * fibonacci(n - 1) + fibonacci(n - 2) * fibonacci(n - 2)) % 47;
        memo.put(n, result);
        
        return result;
    }
}
