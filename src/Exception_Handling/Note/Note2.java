package Exception_Handling.Note;

/*Nếu phương thức của lớp cha không khai báo ném ra exception,
phương thức được ghi đè của lớp cha không thể khai báo ném ra ngoại lệ checked, nhưng ngoại lệ unchecked thì có thể.*/
public class Note2 extends E{
    void method02() throws ArithmeticException{
        System.out.println("child");
    }

    public static void main(String[] args) {
        E e = new Note2();
        e.method02();
    }
}
class E{
    void method02(){
        System.out.println("parent");
    }
}
