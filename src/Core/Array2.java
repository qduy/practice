package Core;

import java.util.Scanner;

public class Array2 {
    public static boolean check(int num){
        if (num<1){
            return false;
        }
        for (int i=2; i<=(int)Math.sqrt(num); i++){
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (check(a[i])){
                System.out.println(a[i]+" ");
            }
        }
    }

}
