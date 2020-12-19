package Core.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Stack_01 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Stack<Character> stack = new Stack<Character>();
      String a = sc.nextLine();
      for (int i=0; i<a.length();i++){
          stack.push(a.charAt(i));
      }
      while (!stack.isEmpty()){
          System.out.println(stack.peek());
          stack.pop();
      }
    }
}
