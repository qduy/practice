package OOP.Level1;

public class Student {
    public int id;
    public String name, address;
    public Student(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object obj){
        return this.id == ((Student)obj).id;
    }
}
class Main01{
    public static void main(String[] args) {
        Student st1 = new Student(1,"David","London");
        Student st2 = new Student(1,"David","London");
        System.out.println(st1.equals(st2));
    }
}
