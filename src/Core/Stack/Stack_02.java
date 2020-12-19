package Core.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<Integer>();
        int n = sc.nextInt();
        while (n>0){
            if (n%2==0){
                st.push(0);
            }
            if (n%2==1){
                st.push(1);
            }
            n /=2;
        }
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
