package Core.String;

public class Khai_niem {
    public static void main(String[] args) {
        char[] ch={'v','i','e','t','t','u','t','s','.','v','n'};
        String str = new String(ch);
        String s = "Hello";
        s.concat(" Java");
        System.out.println(str);
        System.out.println(s);

        String s1="Java";
        String s2 = new String("JavA");
        System.out.println(s1.equalsIgnoreCase(s2));

        //các phương thức của lớp String
        /* startsWith và endsWith*/
        System.out.println(s.startsWith("H"));
        System.out.println(s.endsWith("b"));

        // phương thức trim()
        // phương thức charAt()
        System.out.println(s.charAt(1));

        // phương thức intern()
        String s3 = s2.intern();
        System.out.println(s3);


    }

}
