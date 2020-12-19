package Core.Stack;
import java.util.Scanner;
import java.util.Stack;
public class Stack_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Object> st = new Stack<Object>();

        int count=1;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else if(s.charAt(i)!=s.charAt(i-1))
            {
                st.push(s.charAt(i-1));
                st.push(count);
                count=1;
            }
        }
        st.push(s.charAt(s.length()-1));
        st.push(count);
        for(Object o : st)
        {
            System.out.print(o);
        }
    }
}
