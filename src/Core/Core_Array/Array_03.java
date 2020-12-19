package Core.Core_Array;

import java.util.Scanner;

public class Array_03 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int check = 0;
        int high = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] > high) high = arr[i];
        }

        while(check <= high){
            for (int i = 0; i < arr.length ; i++){
                if (arr[i] == check) sum++;
            }
            if (sum > 0) System.out.print(check + " - " + sum + "; ");
            check++;
            sum = 0;
        }

    }
}
