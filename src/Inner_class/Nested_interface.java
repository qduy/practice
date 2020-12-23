package Inner_class;

public class Nested_interface implements Showable.Message {
    @Override
    public void mes() {
        System.out.println("Nested interface");
    }

    public static void main(String[] args) {
        Showable.Message sm = new Nested_interface();
        sm.mes();
    }
}
interface Showable{
    void show();
    interface Message{
        void mes();
    }
}
