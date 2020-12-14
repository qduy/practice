package OOP.Level4;

public class Employee extends Person{
  private int salary;


  //định nghĩa hàm khởi tạo
  public Employee(String name, int age, String address, int salary) {
    //gọi hàm khởi tạo của lớp person để khởi tạo thuộc tính
    super(name, age, address);
    this.salary = salary;
  }

  public int totalSalary(){return salary;}
  //hàm hiển thị thông itn của Employee
  public void display(){
    //gọi hàm display của lớp person để hiển thị name, age và address
    super.display();
    System.out.println(" có tổng lương là: "+totalSalary());
  }

  public static void main(String[] args) {
    Employee nv = new Employee("Đào Quang Duy",30, "Như Phượng Hạ/Long Hưng/Văn Giang/Hưng Yên",30000000);
    nv.display();
  }

}
