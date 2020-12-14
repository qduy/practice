package OOP.Level2;

public class Down_casting {
    public void display(){
        System.out.println("Parent class");
    }
}
class Child_down_1 extends Down_casting{
    public void display(){
        System.out.println("First child");
    }
}
class Child_down_2 extends Down_casting{
    public void display(){
        System.out.println("Second child");
    }
    public void method_child2(){
        System.out.println("Method of second child");
    }
}
class Main03{
    public static void main(String[] args) {
          Down_casting dnc1 = new Child_down_1();
          dnc1.display();
          Down_casting dnc2 = new Child_down_2();
        //down-casting
        ((Child_down_2)dnc2).method_child2();
    }
}

