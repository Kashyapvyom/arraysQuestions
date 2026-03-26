package Arrays;

import java.util.*;

public class evenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int[] even = new int[evenCount];
        int[] odd = new int[oddCount];
        int e = 0, o = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
                even[e++] = arr[i];
            else
                odd[o++] = arr[i];
        }

        System.out.println("Even: " + Arrays.toString(even));
        System.out.println("Odd: " + Arrays.toString(odd));
    }
}
