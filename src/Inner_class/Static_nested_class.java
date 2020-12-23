package Inner_class;

public class Static_nested_class {
  static int data = 2;
  static class Inner{
      void method(){
          System.out.println("Data: "+data);
      }
  }

    public static void main(String[] args) {
        Static_nested_class.Inner obj = new Static_nested_class.Inner();
        obj.method();
    }
}
