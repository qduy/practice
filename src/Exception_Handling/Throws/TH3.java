package Exception_Handling.Throws;

import java.io.IOException;

//ngoại lệ xảy ra
public class TH3 {

    public static void main(String[] args) throws IOException {
        C c = new C();
        c.method();
        System.out.println("rest of code...");
    }
}
class C{
    void method() throws IOException{
        throw new IOException("Lõi thiết bị");
    }
}
