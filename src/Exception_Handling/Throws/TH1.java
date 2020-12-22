package Exception_Handling.Throws;

import java.io.IOException;

// đã bắt ngoại lệ, tức là xử lý ngoại lệ bằng try/catch
public class TH1 {
    public static void main(String[] args) {
        try {
            A a = new A();
            a.method();
        }catch (Exception e){
            System.out.println("Ngoại lệ được xử lý");
        }
        System.out.println("rest of code....");
    }
}
class A{
    void method() throws IOException{
        throw new IOException("Lỗi thiết bị");
    }
}
