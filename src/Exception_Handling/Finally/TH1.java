package Exception_Handling.Finally;
// nơi ngoại lệ không xảy ra
public class TH1 {
    public static void main(String[] args) {
        try {
            int a = 50/10;
        }catch (ArithmeticException a){
            System.out.println(a);
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code...");
    }
}
