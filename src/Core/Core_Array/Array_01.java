package Core.Core_Array;

import java.util.Scanner;

public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n+1];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(k>=0&&k<=n) {
            int x = sc.nextInt();
            for (int i = n; i > k ; i--) {
                a[i] = a[i-1];
            }
            a[k]=x;
            n++;
        }else {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
