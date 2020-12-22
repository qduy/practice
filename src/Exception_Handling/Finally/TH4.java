package Exception_Handling.Finally;
// có return trong khối try
public class TH4 {
    public static void main(String[] args) {
        try {
            int data = 25;
            if (data % 2 != 0) {
                System.out.println(data + " is odd number");
                return;
            }
        }catch (ArithmeticException a){
            System.out.println(a);
        }finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of code....");
    }
}
