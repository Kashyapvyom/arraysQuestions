package Arrays;

import java.util.Scanner;

public class evenAndOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int even=0,odd=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]%2==0)
                even++;
        else odd++;
        System.out.println("Even count : " +even );
        System.out.println("Odd count : " + odd);
    }
}
