package Exception_Handling.Throw;

// throw để ném ra một ngoại lệ do ta tự tạo ra

public class TH1 {
// ngoại lệ chưa đc xử lý
    static void validate1(int age){
        if (age < 18) throw new ArithmeticException("not valid");
        else System.out.println("welcome");
    }
public static void main(String[] args) {
        validate1(12);
    System.out.println("rest of code...");
}
}
