package Inner_class;

// một lớp được tạo ra bên trong một phương thức
public class Local_inner_class {
    private int data = 20;
    void display(){
        class Local{
            void method(){
                System.out.println(data);
            }
        }
        Local lc = new Local();
        lc.method();
    }

    public static void main(String[] args) {
        Local_inner_class lci = new Local_inner_class();
        lci.display();
    }
}
