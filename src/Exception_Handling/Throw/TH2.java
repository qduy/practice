package Exception_Handling.Throw;

// ngoại lệ có đc xử lý
public class TH2 {
    static void validate2(int age) {
        try {
            if (age < 18)
                throw new ArithmeticException("not valid");
            else
                System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String args[]) {
        validate2(12);
        System.out.println("rest of the code...");
    }
}
