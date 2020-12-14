package OOP.Level4;

public class Person {
    private String name, address;
    private int age;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //hiển thị thông tin
    public void display() {
        System.out.println("Nhân viên: " + name + " - Tuổi: " + age + " -Địa chỉ: " + address);
    }
}


