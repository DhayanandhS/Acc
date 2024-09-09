public class FindDividend {

    public static int findDividendIndex(int[] A, int D, int Q, int R, int N) {
        // Step 1: Calculate the dividend using the formula
        int dividend = D * Q + R;
        
        // Step 2: Search for the dividend in the array
        for (int i = 0; i < N; i++) {
            if (A[i] == dividend) {
                return i; // Return the index of the dividend
            }
        }
        
        // Step 3: If the dividend is not found, return -1
        return -1;
    }
    
    public static void main(String[] args) {
        // Example 1
        int[] A1 = {15, 25, 35, 45};
        int D1 = 5;
        int Q1 = 7;
        int R1 = 0;
        int N1 = A1.length;
        System.out.println(findDividendIndex(A1, D1, Q1, R1, N1));  // Output: 2
    
        // Example 2
        int[] A2 = {10, 20, 30, 40};
        int D2 = 3;
        int Q2 = 7;
        int R2 = 1;
        int N2 = A2.length;
        System.out.println(findDividendIndex(A2, D2, Q2, R2, N2));  // Output: -1
    }
}
