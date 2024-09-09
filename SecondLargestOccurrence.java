import java.util.*;

public class SecondLargestOccurrence{
    public static int countSecondLargestOccurrence(int N, int[] A) {
        // Step 1: Find the largest element
        int largest = A[0];
        for (int i = 1; i < N; i++) {
            if (A[i] > largest) {
                largest = A[i];
            }
        }
        
        // Step 2: Remove all occurrences of the largest element
        List<Integer> filteredList = new ArrayList<>();
        for (int num : A) {
            if (num != largest) {
                filteredList.add(num);
            }
        }
        
        // Step 3: Check if there's any element left for second largest
        if (filteredList.size() == 0) {
            return 0;
        }
        
        // Step 4: Find the second largest element
        int secondLargest = Collections.max(filteredList);
        
        // Step 5: Count occurrences of second largest element in the original array
        int count = 0;
        for (int num : A) {
            if (num == secondLargest) {
                count++;
            }
        }
        
        return count;
    }
    
    
    public static void main(String[] args) {
        // Example 1
        int N1 = 8;
        int[] A1 = {1, 2, 3, 4, 4, 5, 5, 5};
        System.out.println(countSecondLargestOccurrence(N1, A1));  // Output: 2
        
        // Example 2
        int N2 = 1;
        int[] A2 = {5};
        System.out.println(countSecondLargestOccurrence(N2, A2));  // Output: 0
    }
}
