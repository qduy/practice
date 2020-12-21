package Core.String.Tokenizer;

import java.util.StringTokenizer;

public class Basic {
    public static void main(String[] args) {
        StringTokenizer stk = new StringTokenizer("Toi-ten-,la-VietTut","-,",false);
        System.out.println(stk.countTokens());
        /*while (stk.hasMoreTokens()){
            System.out.println(stk.nextToken());
        }*/
        System.out.println("Chuỗi token: " + stk.nextToken("-,"));
        System.out.println("Chuỗi token kế tiếp: " + stk.nextToken("n"));
    }
}
