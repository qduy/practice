package Core.String.StringBuffer;

public class Basic {
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer("Hello ");
        stb.append("Java");
        System.out.println(stb);
        stb.insert(1,"Web");
        System.out.println(stb);
    }
}

