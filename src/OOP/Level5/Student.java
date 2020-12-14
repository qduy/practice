package OOP.Level5;

public class Student {
    private int id;
    private String name;
    private float aver;

    //hàm khỏi tạo mặc định
    public Student(){
        name = " ";
        id = 0;
        aver = 0;
    }
    //hàm khỏi tạo với 3 tham số
    public Student(int a, String b, float c){
        id = a;
        name = b;
        aver = c;
    }

    public String getName() {
        return name;
    }
    public int getId(){
        return id;
    }

    public float getAver() {
        return aver;
    }
    //so sánh 2 đối tượng sv để phục vụ so sánh
    public int compare(Object other){
        Student otherRect = (Student)other;
        return (int)(this.aver-otherRect.aver);
    }
}
