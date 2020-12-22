package Exception_Handling.Finally;
// xảy ra ngoại lệ nhưng không xử lý
public class TH2 {
    public static void main(String[] args) {
        try {
            int a = 50/0;
        }finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code...");
    }
}
