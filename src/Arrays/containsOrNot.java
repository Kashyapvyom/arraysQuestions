package Arrays;

import java.util.Scanner;

public class containsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        int key = sc.nextInt();
        boolean found = false;
        for (int i=0;i<arr.length;i++)
            if(arr[i]==key) {
                found = true;
                break;
            }
        System.out.println(found?"Present":"not present");
    }
}
