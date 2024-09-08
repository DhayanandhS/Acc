public class PoetAndRhymes {

    public static String findBestRhyme(String S, String[] D, int N) {
        String bestRhyme = "No Word";  // Default result if no valid rhyme is found
        int maxSuffixLength = 0;  // To keep track of the longest matching suffix

        // Loop through each word in the dictionary
        for (int i = 0; i < N; i++) {
            String word = D[i];

            // Skip if the word is exactly the same as S
            if (word.equals(S)) {
                continue;
            }

            // Find the length of the matching suffix
            int suffixLength = getMatchingSuffixLength(S, word);

            // If the current word has a longer matching suffix, update bestRhyme
            if (suffixLength > maxSuffixLength) {
                maxSuffixLength = suffixLength;
                bestRhyme = word;
            }
        }

        return bestRhyme;
    }

    // Helper method to find the length of the matching suffix between two words
    private static int getMatchingSuffixLength(String S, String word) {
        int sLen = S.length();
        int wLen = word.length();
        int minLength = Math.min(sLen, wLen);  // Compare only up to the shorter length
        int matchLength = 0;

        // Compare characters from the end of both words
        for (int i = 1; i <= minLength; i++) {
            if (S.charAt(sLen - i) == word.charAt(wLen - i)) {
                matchLength++;
            } else {
                break;  // Stop when characters don't match
            }
        }

        return matchLength;
    }

    public static void main(String[] args) {
        // Example 1
        String S1 = "crave";
        String[] D1 = {"gave", "wave", "save", "brave"};
        int N1 = D1.length;
        System.out.println(findBestRhyme(S1, D1, N1));  // Output: "gave"

    }
}