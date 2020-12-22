package Exception_Handling.Note;

import java.io.IOException;

public class Note01 extends D {
 /*nếu phương thức của lớp cha không khai báo ném ra exception thì phương thức được ghì đè của lớp cha không thể
    ném ra ngoại lệ checked */

    void method01() throws IOException { // ở đây chính là lỗi sai
        System.out.println("test exception child");
    }

    public static void main(String[] args) {
        D d = new Note01();
        d.method01();
    }
}
class D{
    void method01(){
        System.out.println("parent");
    }
}
