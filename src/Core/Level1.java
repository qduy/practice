package Core;

import java.util.Scanner;

// kiểm tra số nguyên tố
public class Level1 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (check(num)){
            System.out.println("Số "+num+" là số nguyên tố");
        }else {
            System.out.println("Số "+num+" không là số nguyên tố");
        }

    }
    public static boolean check(int num){
        if (num < 1) {
            return false;
        }
        for (int i=2; i<=(int)Math.sqrt(num); i++){
            if (num % i ==0){return false;}
        }
        return true;
    }
}

