package Exception_Handling.Throws;

import java.io.IOException;

//  // ngoại lệ không xảy ra
public class TH2 {
    public static void main(String[] args) throws IOException{
        B b = new B();
        b.method();
        System.out.println("rest of code...");
    }

}
class B{
    void method() throws IOException{
        System.out.println("Thiết bị bình thường");
    }
}
