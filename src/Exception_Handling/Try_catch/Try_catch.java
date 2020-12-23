package Exception_Handling.Try_catch;

public class Try_catch {
    // ví dụ
    public static void main(String[] args) {

        try{
            int data = 50/0;
        }catch (ArithmeticException a){
            System.out.println(a);
        }
        System.out.println("rest of code....");
    }
}
