package Exception_Handling.Finally;
//ngoại lệ xảy ra và được xử lý.
public class TH3 {
    public static void main(String[] args) {
        try {
            int a = 50/0;
        }catch (ArithmeticException a){
            System.out.println(a);
        }finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code,,,,");
    }
}
