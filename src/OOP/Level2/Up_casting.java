package OOP.Level2;

public class Up_casting {
    public void display(){
        System.out.println("Parent class");
    }
}
class Child_up_1 extends Up_casting{
    public void display(){
        System.out.println("First child");
    }
}
class Child_up_2 extends Up_casting{
    public void display(){
        System.out.println("Second child");
    }
}
class Main02{
    public static void main(String[] args) {
        //Up-casting
          Up_casting upc1 = new Child_up_1();
          upc1.display();
        //up-casting
          Up_casting upc2 = new Child_up_2();
          upc2.display();
    }
}
