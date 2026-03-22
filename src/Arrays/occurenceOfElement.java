package Arrays;

import java.util.Scanner;

public class occurenceOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int key=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                count++;
        }
        System.out.println("Occurences in the array is : " + count);

    }
}
