package Core.String.StringBuffer;

public class Basic {
    public static String concatWithString(){
        String t = "Java";
        for (int i=0;i<10000;i++){
            t = t+"Hello";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer stb = new StringBuffer("Java");
        for (int i=0;i<10000;i++){
            stb.append("Hello");
        }
        return stb.toString();
    }
    public static void main(String[] args) {
        /*StringBuffer stb = new StringBuffer("Hello ");
        stb.append("Java");
        System.out.println(stb);
        stb.insert(1,"Web");
        System.out.println(stb);
        System.out.println(stb.replace(1,2,"H"));
        System.out.println(stb.capacity());*/

        // test hiệu suất giữa string và stringbuffer
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Thời gian nối chuỗi của lớp String: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Thời gian nối chuỗi của lớp StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

    }
}

