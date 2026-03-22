package Arrays;

import java.util.Scanner;

public class replaceOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i] = sc.nextInt();

        int old=sc.nextInt();
        int newVal=sc.nextInt();
        for(int i=0;i<arr.length;i++)
            if(arr[i]==old)
                arr[i]=newVal;

        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
