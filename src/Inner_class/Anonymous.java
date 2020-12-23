package Inner_class;

public class Anonymous {
    public static void main(String[] args) {
        Person ps = new Person() {
            @Override
            void method() {
                System.out.println("Anonymous inner class");
            }
        };
        ps.method();
    }
}
abstract class Person{
    abstract void method();
}
