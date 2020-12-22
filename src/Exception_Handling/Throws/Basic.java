package Exception_Handling.Throws;

import java.io.IOException;

public class Basic {
    void m() throws IOException{
        throw new IOException("Lỗi thiết bị"); // checked exception
    }
    void n(){
        try {
            m();
        }catch (Exception e){
            System.out.println("Ngoại lệ được xử lý");
        }
    }

    public static void main(String[] args) {
        Basic bs = new Basic();
        bs.n();
        System.out.println("rest of code....");
    }
}
