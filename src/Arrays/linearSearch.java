package Arrays;

import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int i;
        for (i = 0;i<arr.length;i++){
            if(arr[i]==key)
                break;
        }
        System.out.println(i<arr.length ? "found at index " + i : "not found");
    }
}
