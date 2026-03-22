package Arrays;

import java.util.Scanner;

public class averageOfArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        double sum = 0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Average = " + (sum/arr.length));
    }
}
