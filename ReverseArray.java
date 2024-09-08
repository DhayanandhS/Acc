import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        
        // Input validation: Check for non-positive array size
        if (n <= 0) {
            System.out.println("Invalid array size. Must be greater than 0.");
            return;
        }

        int[] arr = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Initialize two pointers for reversing the array
        int start = 0;
        int end = n - 1;
        
        // Reverse the array by swapping elements
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Output the reversed array
        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
