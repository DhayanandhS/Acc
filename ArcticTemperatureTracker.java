public class ArcticTemperatureTracker {

    public static int findLongestTemperatureDrop(int[] A, int N) {
        int currentStreak = 0;
        int maxStreak = 0;

        // Problem Statement: Arctic Temperature Tracker
        // You are given an array A of N integers representing the temperatures recorded at different times in the Arctic. 
        // Your task is to find the longest consecutive streak where the temperature drops continuously for at least 3 consecutive elements. 
        // If no such streak exists, return 0.

        // Input:
        // An integer array A of size N where each element represents the temperature at a specific time.
        // Output:
        // Return the length of the longest consecutive temperature drop that lasts for at least 3 consecutive elements. 
        // If no such streak is found, return 0.
        // Loop through the array and check for temperature drops
        for (int i = 1; i < N; i++) {
            if (A[i] < A[i - 1]) {
                // Temperature has dropped, increase current streak
                currentStreak++;
            } else {
                // Reset the streak if it's less than 3 or store the max streak
                if (currentStreak >= 3) {
                    maxStreak = Math.max(maxStreak, currentStreak);
                }
                currentStreak = 0; // Reset streak if the drop stops
            }
        }
        
        // Final check for the last streak if it's valid
        if (currentStreak >= 3) {
            maxStreak = Math.max(maxStreak, currentStreak);
        }

        return maxStreak >= 3 ? maxStreak : 0;
    }

    public static void main(String[] args) {
        // Example 1
        int[] A1 = {0, -1, -2, -3, -4, 0, -1, -5, -6, -7};
        int N1 = A1.length;
        System.out.println(findLongestTemperatureDrop(A1, N1));  // Output: 4

        // Example 2
        int[] A2 = {-5, -4, -3, -2, -1, 0, 1, 2, 3};
        int N2 = A2.length;
        System.out.println(findLongestTemperatureDrop(A2, N2));  // Output: 0
    }
}