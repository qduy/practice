package Inner_class;

//member inner class được khai báo bên trong một class và bên ngoài phương thức
public class Member_inner_class {
    private int data = 7;
    class Inner{ // lớp này là lớp non-static
        void G(){
            System.out.println("Data: "+data);
        }
    }

    public static void main(String[] args) {
        Member_inner_class outer = new Member_inner_class();
        Member_inner_class.Inner inner = outer.new Inner();
        inner.G();
    }
}
