import java.util.HashSet;

public class VowelPermutation {
    
    // Helper method to calculate factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    

    public static int countVowelPermutations(String S) {
        HashSet<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a'); vowelsSet.add('e'); vowelsSet.add('i'); vowelsSet.add('o'); vowelsSet.add('u');
        vowelsSet.add('A'); vowelsSet.add('E'); vowelsSet.add('I'); vowelsSet.add('O'); vowelsSet.add('U');
        
        int vowelCount = 0;
        boolean hasConsonants = false;
    
        // Traverse the string and count vowels and consonants
        for (char ch : S.toCharArray()) {
            if (vowelsSet.contains(ch)) {
                vowelCount++;
            } else if (Character.isLetter(ch)) {
                hasConsonants = true;
            }
        }
    
        // If there are no consonants or vowels, return 0
        if (vowelCount == 0 || !hasConsonants) {
            return 0;
        }
    
        // Return the factorial of the number of vowels
        return factorial(vowelCount);
    }
    

    public static void main(String[] args) {
        // Example 1
        String S1 = "hello";
        System.out.println(countVowelPermutations(S1));  // Output: 2
    
        // Example 2
        String S2 = "aeiou";
        System.out.println(countVowelPermutations(S2));  // Output: 0
    
        // Example 3
        String S3 = "abc";
        System.out.println(countVowelPermutations(S3));  // Output: 1
    }
    
}
