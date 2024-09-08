import java.util.Arrays;
import java.util.Collections;

public class EvenIndex {
    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50,60};
        int n=6;int sum =0;
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(i%2 ==0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

