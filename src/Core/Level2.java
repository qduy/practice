package Core;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Giai thừa của "+num+" là: "+tinhgt(num));
    }
    /*public static long tinhgt(int num){
        int result = 1;
        for (int i=2; i<=num; i++){
            result *= i;
        }
        return result;
    }*/

        static int tinhgt(int num) {
            if (num == 1)
                return 1;
            else
                return (num * tinhgt(num - 1));
        }


}
